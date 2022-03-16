package com.gmail.giphytestingapp.model

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
        val pageIndex = params.key ?: 0

        val gifs = gifsService.searchGifs(
            query = query,
            limit = params.loadSize,
            offset = pageIndex
        )

        return try {
            return LoadResult.Page(
                data = gifs.data,
                prevKey = if (pageIndex == 0) null else pageIndex - params.loadSize,
                nextKey = if (gifs.pagination.count < params.loadSize) null else pageIndex + params.loadSize + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}