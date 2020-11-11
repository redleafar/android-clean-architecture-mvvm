package com.rbermudez.core.domain.usecase

import com.rbermudez.core.data.repository.BookmarkRepository
import com.rbermudez.core.domain.model.Bookmark
import com.rbermudez.core.domain.model.Document

class AddBookmarkUseCase(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) =
        bookmarkRepository.addBookmark(document, bookmark)
}