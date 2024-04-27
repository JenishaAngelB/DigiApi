package com.example.digiapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.digiapp.model.Digi;
import com.example.digiapp.repository.DigiRepo;


@Service
public class DigiService {

    @Autowired
    DigiRepo digiRepo;

    public Digi create(Digi digi) 
    {
        return digiRepo.save(digi);
    }


    public Digi getById(int digiId) 
    {
        return digiRepo.findById(digiId).orElse(null);
    }

    public List<Digi> getAll() 
    {
        return digiRepo.findAll();
    }

    @SuppressWarnings("unused")
    public boolean updateDigi(int digiId, Digi digi) 
    {
        if (digiRepo.findById(digiId) == null) 
        {
            return false;
        }
        try 
        {
            digiRepo.save(digi);
        } 
        catch (Exception e) 
        {
            return false;
        }

        return true;
    }

    public boolean deleteDigi(int digiId) {
        if (this.getById(digiId)==null) 
        {
            return false;
        }

        digiRepo.deleteById(digiId);
        return true;
    }
}