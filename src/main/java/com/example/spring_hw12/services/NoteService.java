package com.example.spring_hw12.services;

import com.example.spring_hw12.models.Note;

import java.util.List;
import java.util.Optional;


public interface NoteService {
    List<Note> getAllNotes();
    Note getById(long id);
    Note create(Note note);
    Optional<Note> editNote(Long id, Note note);
    void delete(long id);
}