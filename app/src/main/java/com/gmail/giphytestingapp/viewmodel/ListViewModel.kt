package com.gmail.giphytestingapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.gmail.giphytestingapp.model.ListRepository
import com.gmail.giphytestingapp.model.entity.DataItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val listRepository: ListRepository
) : ViewModel() {

    private val searchBy = MutableLiveData("")

    @ExperimentalCoroutinesApi
    val gifFlow: Flow<PagingData<DataItem>> = searchBy.asFlow().flatMapLatest {
        listRepository.getPagedGifs(it)
    }.cachedIn(viewModelScope)

    fun setSearchBy(value: String) {
        if (this.searchBy.value == value) return
        this.searchBy.value = value
    }

    fun refresh() {
        this.searchBy.postValue(this.searchBy.value)
    }
}