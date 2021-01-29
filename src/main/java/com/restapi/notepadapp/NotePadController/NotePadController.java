package com.restapi.notepadapp.NotePadController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.notepadapp.CommonStandardData;
import com.restapi.notepadapp.NotePad;
import com.restapi.notepadapp.serviceImpl.NotePadServiceImpl;

@CrossOrigin(origins = CommonStandardData.APP_URL)
@RequestMapping("noteApp")
@RestController
public class NotePadController {

	@Autowired
	private NotePadServiceImpl notePadServiceImpl;
	
	@PostMapping("/add")
	public NotePad save(@RequestBody NotePad note) {
		return notePadServiceImpl.saveNote(note);
	}
	
	@PutMapping("/update")
	public NotePad update(@RequestBody NotePad note) {
		return notePadServiceImpl.updateNote(note);
	}
	
	
	@GetMapping("/allNotes")
	public List<NotePad> getAllNotes(){
		return notePadServiceImpl.getAllNotList();
	}
	
	@GetMapping("/by/{title}")
	public Optional<NotePad> getNote(@PathVariable(name="title") String title) {
		return notePadServiceImpl.getNote(title);
	}
	
	@DeleteMapping("/delete/{title}")
	public void deleteNote(@PathVariable(name="title") String title) {
		notePadServiceImpl.deleteNote(title);
	}
	
}
