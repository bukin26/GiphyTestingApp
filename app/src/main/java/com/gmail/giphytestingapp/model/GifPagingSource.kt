package com.gmail.giphytestingapp.model

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.gmail.giphytestingapp.model.entity.DataItem

class GifPagingSource(
    private val gifsService: GifsService,
    private val query: String
) : PagingSource<Int, DataItem>() {
    override fun getRefreshKey(state: PagingState<Int, DataItem>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, DataItem> {
        val offset = params.key ?: 0


        val gifs = gifsService.searchGifs(
            query = query,
            limit = params.loadSize,
            offset = offset
        )

        return try {
            return LoadResult.Page(
                data = gifs.data,
                prevKey = if (offset == 0) null else offset - params.loadSize,
                nextKey = if (gifs.data.size == params.loadSize) params.loadSize + offset else null
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}
