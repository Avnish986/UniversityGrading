package com.test.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String studentName;
    private Course course;
    private List<Subject> completedSubjects;

    public Student(String studentId, String studentName, Course course, List<Subject> completedSubjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.completedSubjects = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Course getCourse() {
        return course;
    }

    public List<Subject> getCompletedSubjects() {
        return completedSubjects;
    }

    public void completeSubject(Subject subject) {
        if (!completedSubjects.contains(subject)) {
            completedSubjects.add(subject);
        }
    }

    public boolean canEnroll(Subject subject) {
        if (!subject.hasPrerequisites()) {
            return true; // No prerequisites, can enroll
        }

        for (Subject prerequisite : subject.getPrerequisites()) {
            if (!completedSubjects.contains(prerequisite)) {
                return false; // Prerequisite not completed
            }
        }
        return true;
    }

    public boolean enrollInSubject(Subject subject) {
        if (canEnroll(subject)) {
            System.out.println("Enrolled in subject: " + subject.getSubjectName());
            return true;
        } else {
            System.out.println("Cannot enroll in subject: " + subject.getSubjectName() + ". Prerequisites not met.");
            return false;
        }
    }

}
