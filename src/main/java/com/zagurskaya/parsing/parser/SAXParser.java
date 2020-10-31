package com.zagurskaya.parsing.parser;

import com.zagurskaya.parsing.builder.StudentsSAXBuilder;

public class SAXParser {
    public static void main(String[] args) {
        StudentsSAXBuilder saxBuilder = new StudentsSAXBuilder();
        saxBuilder.buildSetStudents("data/students.xml");
        System.out.println(saxBuilder.getStudents());
    }
}
