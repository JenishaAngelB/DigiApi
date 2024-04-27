package com.example.digiapp.controller;

import com.example.digiapp.model.Digi;
import com.example.digiapp.service.DigiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @RequestMapping("/api")
public class DigiController {

    @Autowired
    public DigiService digiService;

    @PostMapping("/digi")
    public ResponseEntity<Digi> add(@RequestBody Digi digi) 
    {
        Digi newDigi = digiService.create(digi);
        return new ResponseEntity<>(newDigi, HttpStatus.CREATED);
    }

    @GetMapping("/digis/{digiId}")
    public ResponseEntity<Digi> get(@PathVariable int digiId) 
    {
        try
        {
            Digi d = digiService.getById(digiId);
            return new ResponseEntity<>(d, HttpStatus.OK);
        } 
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/digiss")
    public ResponseEntity<List<Digi>> getAll() {
        try
        {
            List<Digi> d = digiService.getAll();
            return new ResponseEntity<>(d, HttpStatus.OK);
        } 
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/digi/{digiId}")
    public ResponseEntity<Digi> putMethod(@PathVariable ("digiId") int digiId, @RequestBody Digi digi) 
    {
        if (digiService.updateDigi(digiId, digi)==true) 
        {
            return new ResponseEntity<>(digi, HttpStatus.OK);
        } 
        else 
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/digi/{digiId}")
    public ResponseEntity<Boolean> delete(@PathVariable ("digiId") int digiId) 
    {
        if (digiService.deleteDigi(digiId)==true) 
        {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } 
        else 
        {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }
}