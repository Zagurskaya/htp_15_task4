package com.zagurskaya.parsing.entity;

public class Address {
    protected String country;
    protected String city;
    protected String street;

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }

    public String getStreet() {

        return street;
    }

    public void setStreet(String value) {
        this.street = value;
    }

    @Override
    public String toString() {
        return "\n\t\tAddress: " +
                "\n\t\t\tcountry: " + country +
                "\n\t\t\tcity: " + city +
                "\n\t\t\tstreet: " + street;
    }
}