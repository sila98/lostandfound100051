package com.app.lostfound.Model;

import javax.persistence.*;

@Entity
@Table(name= "STAFF")
public class Staff {
    @Id
    @Column(name= "STAFF_ID")
    private Long staffId;
    @Column(name ="STAFF_NAME")
    private String staffname;
    @ManyToMany
    @JoinColumn(name= "CARD_ID")
    @Column(name = "EMAIL_ADD")
    private String emailaddress;
    @Column(name= "GENDER")
    private String Gender;

    public Staff(Long staffId, String staffname, String emailaddress, String gender) {
        this.staffId = staffId;
        this.staffname = staffname;
        this.emailaddress = emailaddress;
        Gender = gender;
    }

    //setters and getters


    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
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
        return "Staff{" +
                "staffId=" + staffId +
                ", staffname='" + staffname + '\'' +
                ", emailaddress='" + emailaddress + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
