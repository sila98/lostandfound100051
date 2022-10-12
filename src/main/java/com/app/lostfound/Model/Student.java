package com.app.lostfound.Model;

import javax.persistence.*;


@Entity
@Table(name = "STUDENT")

public class Student {

    @Id
    @Column(name = "STUDENT_ID")
    private Long studentId;
    @Column(name ="FIRST_NAME")
    private String firstname;
    @Column(name= "FIRST_NAME")
    private String secondname;
    @ManyToMany
    @JoinColumn(name = "CARD_ID")
    @Column(name= "MAIL_ADD")
    private String emailaddress;
    @Column(name = "GENDER")
    private String Gender;


    //Constructors
    public Student(Long studentId, String firstname, String secondname, String emailaddress, String gender) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.secondname = secondname;
        this.emailaddress = emailaddress;
        Gender = gender;
    }

    //Setters and Getters


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", emailaddress='" + emailaddress + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
