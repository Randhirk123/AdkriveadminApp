package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.ManageKeyWord;

@Repository
public interface ManagekeywordRepositiory extends JpaRepository<ManageKeyWord, Integer> {

	
}
