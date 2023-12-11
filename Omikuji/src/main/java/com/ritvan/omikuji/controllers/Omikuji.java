package com.ritvan.omikuji.controllers;

public class Omikuji {
    private int number;
    private String city;
    private String person;
    private String hobby;
    private String thing;
    private String something;

    public Omikuji(int number, String city, String person, String hobby, String thing, String something) {
        this.number = number;
        this.city = city;
        this.person = person;
        this.hobby = hobby;
        this.thing = thing;
        this.something = something;
    }

    public Omikuji() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return "Omikuji{" +
                "number=" + number +
                ", city='" + city + '\'' +
                ", person='" + person + '\'' +
                ", hobby='" + hobby + '\'' +
                ", thing='" + thing + '\'' +
                ", something='" + something + '\'' +
                '}';
    }
}
