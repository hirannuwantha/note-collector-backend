package com.example.demo.service;

import com.example.demo.entity.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository repository;


    public Note saveNote(Note note){
        return repository.save(note);
    }

    public List<Note> getAllNotes(){
        return repository.findAll();
    }

    public Note getNoteById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteNoteById(int id){
        repository.deleteById(id);
        return id+" Product Removed";
    }
    
    public Note updateNotes(Note note){
        Note noteData = repository.findById(note.getId()).orElse(null);
        noteData.setDescription(note.getDescription());
        noteData.setDateTime(note.getDateTime());
        noteData.setImageUrl(note.getImageUrl());

        return repository.save(noteData);
    }
}
