package com.test.model;

import java.util.List;

public class Semester {
    private String semesterId;
    private List<Subject> subjects;

    public Semester(String semesterId, List<Subject> subjects) {
        this.semesterId = semesterId;
        this.subjects = subjects;
    }

    public String getSemesterId() {
        return semesterId;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
