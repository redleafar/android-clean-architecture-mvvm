package com.rbermudez.core.domain.usecase

import com.rbermudez.core.data.repository.DocumentRepository
import com.rbermudez.core.domain.model.Document

class RemoveDocumentUseCase(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke(document: Document) = documentRepository.removeDocument(document)
}