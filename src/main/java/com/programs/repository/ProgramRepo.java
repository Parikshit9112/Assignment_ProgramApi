package com.programs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programs.entity.Program;

@Repository
public interface ProgramRepo extends JpaRepository<Program, Long>{
      Optional<Program> findByName(String name);
}
