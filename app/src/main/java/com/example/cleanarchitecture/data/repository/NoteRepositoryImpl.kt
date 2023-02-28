package com.example.cleanarchitecture.data.repository

import com.example.cleanarchitecture.data.local.NoteDao
import com.example.cleanarchitecture.data.mappers.toNote
import com.example.cleanarchitecture.data.mappers.toNoteEntity
import com.example.cleanarchitecture.domain.model.Note
import com.example.cleanarchitecture.domain.repository.NoteRepository

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {

    override fun createNote(note: Note) {
        noteDao.createNote(note.toNoteEntity())
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toNoteEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toNoteEntity())
    }

    override fun getNotes(): List<Note> {
        return noteDao.getNotes().map { it.toNote() }
    }
}