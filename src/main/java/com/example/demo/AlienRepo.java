package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Repo;

public interface AlienRepo extends JpaRepository<Repo, Integer>{
//	List<Repo> findByname(String name);
	@Query("FROM Repo WHERE name=:name")
	List<Repo> find (@Param("name") String name);

}
