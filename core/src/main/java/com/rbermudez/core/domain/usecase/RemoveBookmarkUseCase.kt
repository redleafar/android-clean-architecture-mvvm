package com.rbermudez.core.domain.usecase

import com.rbermudez.core.data.repository.BookmarkRepository
import com.rbermudez.core.domain.model.Bookmark
import com.rbermudez.core.domain.model.Document

class RemoveBookmarkUseCase (private val bookmarksRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarksRepository
        .removeBookmark(document, bookmark)
}