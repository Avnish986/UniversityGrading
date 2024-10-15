package com.test.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> studentList;

    public University() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Mark> getSemesterWise(String studentId, String semesterId) {
        List<Mark> markList = new ArrayList<>();
        for(Student student : studentList) {
            if(student.getStudentId().equals(studentId)) {
                for(Semester semester : student.getCourse().getSemester()) {
                    if(semester.getSemesterId().equals(semesterId)) {
                        for(Subject subject : semester.getSubjects()) {
                            Mark mark;
                            if(subject.isPass()) {
                                mark = new Mark(subject, subject.getCredit());
                            } else {
                                mark = new Mark(subject, 0);
                            }
                            markList.add(mark);
                        }
                    }
                }
            }
        }
        return markList;
    }

    public List<Mark> getConsolidatedMarkSheet(String studentId) {
        List<Mark> markList = new ArrayList<>();
        for(Student student : studentList) {
            if(student.getStudentId().equals(studentId)) {
                for(Semester semester : student.getCourse().getSemester()) {
                    for(Subject subject : semester.getSubjects()) {
                        Mark mark;
                        if(subject.isPass()) {
                            mark = new Mark(subject, subject.getCredit());
                        } else {
                            mark = new Mark(subject, 0);
                        }
                        markList.add(mark);
                    }
                }
            }
        }
        return markList;
    }
}
