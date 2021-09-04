package com.marvel.api.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Results {
    private long id;
    private String name;
    private Date modified;
    private String description;
    private String resourceURI;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("modified")
    public Date getModified() { return modified; }
    @JsonProperty("modified")
    public void setModified(Date value) { this.modified = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("resourceURI")
    public String getResourceURI() { return resourceURI; }
    @JsonProperty("resourceURI")
    public void setResourceURI(String value) { this.resourceURI = value; }
}
