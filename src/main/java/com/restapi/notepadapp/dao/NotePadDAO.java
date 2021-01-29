package com.restapi.notepadapp.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.notepadapp.NotePad;


@Repository
public interface NotePadDAO extends JpaRepository<NotePad, String> {
	
}
