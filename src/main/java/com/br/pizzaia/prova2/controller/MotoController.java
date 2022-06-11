package com.br.pizzaia.prova2.controller;

import com.br.pizzaia.prova2.model.Moto;
import com.br.pizzaia.prova2.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MotoController {

    @Autowired
    private MotoService motoService;

    @GetMapping("/motos")
    public ResponseEntity<List<Moto>> getAllMotos() {
        return new ResponseEntity<>(motoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/motos/{renavam}")
    public ResponseEntity<Moto> getMotoByRenavam(@PathVariable Long renavam) {
        return new ResponseEntity<>(motoService.getMotoByRenavam(renavam), HttpStatus.OK);
    }

    @PostMapping("/motos")
    public ResponseEntity<Void> saveOrUpdateMotorcicly(@RequestBody Moto moto) {
        motoService.saveOrUpdateMotorcicly(moto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/motos/{renavam}")
    public ResponseEntity<Void> deleteMoto(@PathVariable Long renavam) {
        motoService.deleteMoto(renavam);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
