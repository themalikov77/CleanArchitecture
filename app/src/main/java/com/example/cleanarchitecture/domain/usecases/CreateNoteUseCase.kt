package com.example.cleanarchitecture.domain.usecases

import com.example.cleanarchitecture.domain.model.Note
import com.example.cleanarchitecture.domain.repository.NoteRepository
import javax.inject.Inject

class CreateNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {
    fun createNote(note: Note) = noteRepository.createNote(note)
}