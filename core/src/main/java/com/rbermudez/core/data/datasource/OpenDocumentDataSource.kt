package com.rbermudez.core.data.datasource

import com.rbermudez.core.domain.model.Document

interface OpenDocumentDataSource {
    fun setOpenDocument(document: Document)
    fun getOpenDocument(): Document
}