package com.test.model;

import java.util.List;

public class Subject {
    private String subjectId;
    private String subjectName;
    private SubjectType type;
    private int credit;
    private List<Subject> prerequisites;
    private boolean pass;

    public Subject(String subjectId, String subjectName, SubjectType type, int credit, List<Subject> prerequisites) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.type = type;
        this.credit = credit;
        this.prerequisites = prerequisites;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredit() {
        return credit;
    }

    public SubjectType getType() {
        return type;
    }

    public List<Subject> getPrerequisites() {
        return prerequisites;
    }

    public void setPass(boolean result) {
        this.pass = result;
    }

    public boolean isPass() {
        return pass;
    }

    public boolean hasPrerequisites() {
        return prerequisites != null && !prerequisites.isEmpty();
    }
}
