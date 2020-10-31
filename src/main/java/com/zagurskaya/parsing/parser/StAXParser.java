package com.zagurskaya.parsing.parser;

import com.zagurskaya.parsing.builder.StudentsStAXBuilder;

public class StAXParser {
    public static void main(String[] args) {
        StudentsStAXBuilder staxBuilder = new StudentsStAXBuilder();
        staxBuilder.buildSetStudents("data/students.xml");
        System.out.println(staxBuilder.getStudents());
    }
}
