package com.restapi.notepadapp.serviceImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.restapi.notepadapp.NotePad;
import com.restapi.notepadapp.dao.NotePadDAO;
import com.restapi.notepadapp.service.NotePadService;

@Service
public class NotePadServiceImpl implements NotePadService {

	@Autowired
	private NotePadDAO notePadDao;
	
	@Override
	public NotePad saveNote(NotePad notePad) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		notePad.setLocalTime(dateFormat.format(cal.getTime()));
		return notePadDao.save(notePad);
	}

	@Override
	public NotePad updateNote(NotePad notePad) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		notePad.setLocalTime(dateFormat.format(cal.getTime()));
		return notePadDao.saveAndFlush(notePad);
	}

	@Override
	public List<NotePad> getAllNotList() {
		// TODO Auto-generated method stub
		List<NotePad> arr = new ArrayList<>();
		for (NotePad notePad : notePadDao.findAll(Sort.by(Sort.Direction.DESC,"localTime"))) {
			arr.add(notePad);
		}
		return arr;
	}

	@Override
	public Optional<NotePad> getNote(String title) {
		// TODO Auto-generated method stub
		return notePadDao.findById(title);
	}

	@Override
	public void deleteNote(String title) {
		// TODO Auto-generated method stub
		notePadDao.deleteById(title);
	}

}
