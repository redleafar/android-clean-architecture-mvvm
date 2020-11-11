package com.rbermudez.core.domain.usecase

import com.rbermudez.core.data.repository.DocumentRepository
import com.rbermudez.core.domain.model.Document

class SetOpenDocumentUseCase(private val documentRepository: DocumentRepository) {
    operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}