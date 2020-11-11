package com.rbermudez.core.domain.usecase

import com.rbermudez.core.data.repository.BookmarkRepository
import com.rbermudez.core.domain.model.Document

class GetBookmarksUseCase(private val bookmarkRepository: BookmarkRepository) {

    suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}