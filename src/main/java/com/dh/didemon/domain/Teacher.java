package com.dh.didemon.domain;

public class Teacher {
private  long id;

    public Teacher() {

    }

    private  String name;
    public Teacher(long id, String name){
        this.id = id;
        this.name = name;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
