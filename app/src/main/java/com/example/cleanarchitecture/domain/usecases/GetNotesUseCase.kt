package com.example.cleanarchitecture.domain.usecases

import com.example.cleanarchitecture.domain.repository.NoteRepository

class GetNotesUseCase(private val noteRepository: NoteRepository) {

    fun getNotes() = noteRepository.getNotes()
}