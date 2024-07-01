package com.example.Student_Management_App;

public class Student {

    private int admNo; //primary key
    private int age;
    private String name;
    private String email;
    private String course;

    public Student() {
    }

    public Student(int admNo, int age, String name, String email, String course) {
        this.admNo = admNo;
        this.age = age;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
