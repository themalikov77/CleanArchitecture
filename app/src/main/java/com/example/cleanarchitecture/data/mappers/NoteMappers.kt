package com.example.cleanarchitecture.data.mappers

import com.example.cleanarchitecture.data.model.NoteEntity
import com.example.cleanarchitecture.domain.model.Note

fun NoteEntity.toNote() = Note(
    id, title, description, createdAt
)

fun Note.toNoteEntity() = NoteEntity(id, title, description, createdAt)

