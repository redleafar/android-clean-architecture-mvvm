package com.rbermudez.core.domain.usecase

import com.rbermudez.core.data.repository.DocumentRepository
import com.rbermudez.core.domain.model.Document

class AddDocumentUseCase(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)
}