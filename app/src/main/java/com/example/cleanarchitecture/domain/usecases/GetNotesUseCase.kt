package com.example.cleanarchitecture.domain.usecases

import com.example.cleanarchitecture.domain.repository.NoteRepository
import javax.inject.Inject

class GetNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    fun getNotes() = noteRepository.getNotes()
}