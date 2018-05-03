package com.dh.didemon.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Teacher {

    @Id
    private String id;
    private  long ci;
    public Teacher() {

    }

    private  String name;
    public Teacher(long id, String name){
        this.ci = id;
        this.name = name;
    }
    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
