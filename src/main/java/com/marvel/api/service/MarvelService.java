package com.marvel.api.service;


import java.util.Date;

import com.marvel.api.controller.model.Characters;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import com.marvel.api.client.MarvelCharactersClient;

@Service
public class MarvelService {
    private static final String public_key = "";  ////////////  <-----
    private static final String private_key = ""; ////////////  <-----

    private MarvelCharactersClient client;

    public Characters findAll() {
        Long timeStamp = new Date().getTime();
        return client.getAll(timeStamp, public_key, buildHash(timeStamp));
    }

    private String buildHash(Long timeStamp) {
        return DigestUtils.md5Hex(timeStamp + private_key + public_key);
    }

    public MarvelService(MarvelCharactersClient client) {
        this.client = client;
    }
}

