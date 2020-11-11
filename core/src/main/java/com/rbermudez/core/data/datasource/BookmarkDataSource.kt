package com.rbermudez.core.data.datasource

import com.rbermudez.core.domain.model.Bookmark
import com.rbermudez.core.domain.model.Document

interface BookmarkDataSource {
    suspend fun add(document: Document, bookmark: Bookmark)
    suspend fun read(document: Document): List<Bookmark>
    suspend fun remove(document: Document, bookmark: Bookmark)
}