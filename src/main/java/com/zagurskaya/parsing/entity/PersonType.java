package com.zagurskaya.parsing.entity;

public class PersonType {
    protected String name;
    protected Integer telephone;
    protected Address address;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer value) {
        this.telephone = value;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address value) {
        this.address = value;
    }
}