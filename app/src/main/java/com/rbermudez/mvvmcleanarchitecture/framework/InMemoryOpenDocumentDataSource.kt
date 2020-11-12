package com.rbermudez.mvvmcleanarchitecture.framework

import com.rbermudez.core.data.datasource.OpenDocumentDataSource
import com.rbermudez.core.domain.model.Document

class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument() = openDocument
}