package com.example.cleanarchitecture.domain.repository

import com.example.cleanarchitecture.domain.model.Note

interface NoteRepository {
    fun createNote(note: Note)

    fun editNote(note: Note)

    fun deleteNote(note: Note)

    fun getNotes(): List<Note>
}