package com.example.cleanarchitecture.domain.usecases

import com.example.cleanarchitecture.domain.model.Note
import com.example.cleanarchitecture.domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    fun editNote(note: Note) = noteRepository.editNote(note)
}