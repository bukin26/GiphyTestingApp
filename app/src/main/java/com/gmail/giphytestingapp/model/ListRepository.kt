package com.gmail.giphytestingapp.model

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.gmail.giphytestingapp.model.entity.DataItem
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ListRepository @Inject constructor(
    private val gifsService: GifsService
) {
    fun getPagedGifs(query: String): Flow<PagingData<DataItem>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = NETWORK_PAGE_SIZE),
            pagingSourceFactory = { GifPagingSource(gifsService, query) }
        ).flow
    }

    companion object {
        private const val NETWORK_PAGE_SIZE = 4
    }
}