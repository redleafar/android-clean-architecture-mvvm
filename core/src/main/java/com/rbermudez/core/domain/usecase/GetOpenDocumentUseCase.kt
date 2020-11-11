package com.rbermudez.core.domain.usecase

import com.rbermudez.core.data.repository.DocumentRepository

class GetOpenDocumentUseCase(private val documentRepository: DocumentRepository) {
    operator fun invoke() = documentRepository.getOpenDocument()
}