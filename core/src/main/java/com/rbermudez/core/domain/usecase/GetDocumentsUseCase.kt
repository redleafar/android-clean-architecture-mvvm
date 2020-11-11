package com.rbermudez.core.domain.usecase

import com.rbermudez.core.data.repository.DocumentRepository

class GetDocumentsUseCase(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke() = documentRepository.getDocuments()
}