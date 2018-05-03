package com.dh.didemon.domain;

import org.springframework.data.annotation.Id;

public class Student {

    @Id
    private String id;
    private long ci;
    public Student() {

    }
    private String name;

    public Student(long id, String name) {
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
