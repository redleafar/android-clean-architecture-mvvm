package com.rbermudez.core.data.datasource

import com.rbermudez.core.domain.model.Document

interface DocumentDataSource {
    suspend fun add(document: Document)
    suspend fun readAll(): List<Document>
    suspend fun remove(document: Document)
}