package com.rbermudez.core.data.repository

import com.rbermudez.core.data.datasource.BookmarkDataSource
import com.rbermudez.core.domain.model.Bookmark
import com.rbermudez.core.domain.model.Document

class BookmarkRepository(private val dataSource: BookmarkDataSource) {
    suspend fun addBookmark(document: Document, bookmark: Bookmark) =
        dataSource.add(document, bookmark)

    suspend fun getBookmarks(document: Document) = dataSource.read(document)

    suspend fun removeBookmark(document: Document, bookmark: Bookmark) =
        dataSource.remove(document, bookmark)
}