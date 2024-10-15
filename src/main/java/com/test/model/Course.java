package com.test.model;

import java.util.List;

public class Course {
    private String courseId;
    private int credit;
    private CourseName courseName;
    private List<Semester> semesters;


    public Course(String courseId, int credit, CourseName courseName, List<Semester> semesters) {
        this.courseId = courseId;
        this.credit = credit;
        this.courseName = courseName;
        this.semesters = semesters;
    }

    public String getCourseId() {
        return courseId;
    }

    public CourseName getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }

    public List<Semester> getSemester() {
        return semesters;
    }
}
