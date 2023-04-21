package com.example.demo.controller;

import com.example.demo.entity.Note;
import com.example.demo.service.NoteService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController

public class NoteController {
    @Autowired
    private NoteService service;

    @PostMapping("/addNotes")
    public Note addNote(@RequestBody Note note){
        return service.saveNote(note);
    }
    @GetMapping("/getAllNotes")
    public List<Note> gettAllNotes(){
        return service.getAllNotes();
    }
    @GetMapping("/getAllNote/{id}")
    public Note getNoteById(@PathVariable int id){
        return service.getNoteById(id);
    }

    @PutMapping("/updateNote")
    public Note updateNote(@RequestBody Note note){
        return service.updateNotes(note);
    }

    @DeleteMapping("/deleteNote/{id}")
    public String deleteNote(@PathVariable int id){
        return service.deleteNoteById(id);
    }
}
