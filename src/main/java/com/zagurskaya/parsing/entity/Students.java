package com.zagurskaya.parsing.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;

public class Students {
    protected List<JAXBElement<? extends PersonType>> person;

    public List<JAXBElement<? extends PersonType>> getPerson() {
        if (person == null) {
            person = new ArrayList<JAXBElement<? extends PersonType>>();
        }
        return this.person;
    }
}