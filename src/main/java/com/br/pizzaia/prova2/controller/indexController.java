package com.br.pizzaia.prova2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping("/")
    public ResponseEntity<String> getIndex() {
        return new ResponseEntity<>("Olá mundo", HttpStatus.OK);
    }
}
