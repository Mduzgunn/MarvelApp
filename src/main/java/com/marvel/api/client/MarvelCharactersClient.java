package com.marvel.api.client;


import com.marvel.api.controller.model.Characters;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "marvel", url = "${url.marvel}/v1/public")
public interface MarvelCharactersClient {
    @GetMapping("/characters")
    public Characters getAll(@RequestParam(value = "ts") Long timeStamp,
                             @RequestParam(value = "apikey") String publicKey,
                             @RequestParam(value = "hash") String hashMD5);
}
