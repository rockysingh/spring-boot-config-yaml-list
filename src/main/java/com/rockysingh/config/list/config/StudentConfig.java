package com.rockysingh.config.list.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "students")
@Configuration
public class StudentConfig {

    private String teacher;

    private List<Student> studentList = new ArrayList<>();

    public StudentConfig() {}

    public StudentConfig(String teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public static class Student {

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public Student() {}


    }
}
