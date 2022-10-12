package com.app.lostfound.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "CARDFORM") //database
public class CardForm {

    @Id
    //annotate
    @Column(name = "CARD_ID")

    private Long cardId;
    @Column(name = "SURNAME_")
    private String surname;
    @Column(name ="FINDER_NUM")
    private String finderphonenumber;
    @Column(name = "LOCATION_")
    private String Location;

    public CardForm(Long cardId, String surname, String finderphonenumber, String location) {
        this.cardId = cardId;
        this.surname = surname;
        this.finderphonenumber = finderphonenumber;
        Location = location;
    }

    //getter and setters

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFinderphonenumber() {
        return finderphonenumber;
    }

    public void setFinderphonenumber(String finderphonenumber) {
        this.finderphonenumber = finderphonenumber;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }


    //data sent to database
    @Override
    public String toString() {
        return "CardForm{" +
                "cardId=" + cardId +
                ", surname='" + surname + '\'' +
                ", finderphonenumber='" + finderphonenumber + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }

}