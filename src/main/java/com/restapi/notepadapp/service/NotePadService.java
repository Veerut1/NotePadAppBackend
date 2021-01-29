package com.restapi.notepadapp.service;

import java.util.List;
import java.util.Optional;

import com.restapi.notepadapp.NotePad;

public interface NotePadService {

	NotePad saveNote(NotePad notePad);
	NotePad updateNote(NotePad notePad);
	List<NotePad> getAllNotList();
	Optional<NotePad> getNote(String title);
	void deleteNote(String title);
	
}

