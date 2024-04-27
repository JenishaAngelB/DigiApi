package com.example.digiapp.repository;

import com.example.digiapp.model.Digi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigiRepo extends JpaRepository<Digi, Integer> 
{
    
}