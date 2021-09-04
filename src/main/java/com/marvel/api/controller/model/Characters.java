package com.marvel.api.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Characters {
    private String copyright;
    private String attributionHTML;
    private Data data;

    @JsonProperty("copyright")
    public String getCopyright() { return copyright; }
    @JsonProperty("copyright")
    public void setCopyright(String value) { this.copyright = value; }

    @JsonProperty("attributionHTML")
    public String getAttributionHTML() { return attributionHTML; }
    @JsonProperty("attributionHTML")
    public void setAttributionHTML(String value) { this.attributionHTML = value; }

    @JsonProperty("data")
    public Data getData() { return data; }
    @JsonProperty("data")
    public void setData(Data value) { this.data = value; }
}