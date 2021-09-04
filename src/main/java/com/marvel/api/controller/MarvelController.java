package com.marvel.api.controller;

import com.marvel.api.service.MarvelService;
import com.marvel.api.controller.model.Characters;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marvel")
public class MarvelController {

    private MarvelService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/characters")
    public Characters findAll() {
        return service.findAll();
    }

    public MarvelController(MarvelService service) {
        this.service = service;
    }
}
