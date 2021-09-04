package com.marvel.api.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    private Results[] results;

    @JsonProperty("results")
    public Results[] getResults() { return results; }
    @JsonProperty("results")
    public void setResults(Results[] value) { this.results = value; }}
