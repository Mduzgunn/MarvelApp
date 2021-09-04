package com.marvel.api.service;


import java.util.Date;

import com.marvel.api.controller.model.Characters;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import com.marvel.api.client.MarvelCharactersClient;

@Service
public class MarvelService {
    private static final String PUBLIC_KEY = "de8ae6b7ddc90c4bbcaba79435515c1a";
    private static final String PRIVATE_KEY = "36411abdd8d7167a1f98760edadb5189be6b339d";

    private MarvelCharactersClient client;

    public Characters findAll() {
        Long timeStamp = new Date().getTime();
        return client.getAll(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
    }

    private String buildHash(Long timeStamp) {
        return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);
    }

    public MarvelService(MarvelCharactersClient client) {
        this.client = client;
    }
}

