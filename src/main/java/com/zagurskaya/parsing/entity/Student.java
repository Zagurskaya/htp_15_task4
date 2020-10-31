package com.zagurskaya.parsing.entity;

public class Student extends PersonType {

    protected String login;
    protected String faculty;

    public String getLogin() {
        return login;
    }

    public void setLogin(String value) {
        this.login = value;
    }

    public String getFaculty() {
        if (faculty == null) {
            return "mmf";
        } else {
            return faculty;
        }
    }

    public void setFaculty(String value) {
        this.faculty = value;
    }

    @Override
    public String toString() {
        return "\n\tStudent: " +
                "\n\t\tname: " + name +
                "\n\t\ttelephone: " + telephone +
                address;
    }
}