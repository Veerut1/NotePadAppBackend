package com.restapi.notepadapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="notesdata")
@Entity
public class NotePad {

	@Id
	@Column(name="note_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long noteId;
	
	@Column(name = "local_time",updatable = true)
	private String localTime;
	
	@Column(name = "note_title",unique = true)
	private String title;
	
	@Column(name = "note_data")
	private String data;
	
	

	public NotePad() {
		super();
		// TODO Auto-generated constructor stub
	}



	public NotePad(String localTime, String title, String data) {
		super();
		this.localTime = localTime;
		this.title = title;
		this.data = data;
	}



	public Long getNoteId() {
		return noteId;
	}



	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}



	public String getLocalTime() {
		return localTime;
	}



	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	@Override
	public String toString() {
		return "NotePad [localTime=" + localTime + ", title=" + title + ", data=" + data + "]";
	}
	
	
	
	
}
