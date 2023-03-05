package com.berna.workshopspringbootmongodb.dto;

import com.berna.workshopspringbootmongodb.domain.User;
import org.springframework.data.annotation.Id;

public class AuthorDTO {
    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
