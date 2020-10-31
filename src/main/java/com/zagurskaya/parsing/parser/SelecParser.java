package com.zagurskaya.parsing.parser;

import com.zagurskaya.parsing.builder.AbstractStudentsBuilder;
import com.zagurskaya.parsing.builder.StudentBuilderFactory;

public class SelecParser {
    public static void main(String[] args) {
        StudentBuilderFactory sFactory = new StudentBuilderFactory();
        AbstractStudentsBuilder builder = sFactory.createStudentBuilder("stax");
//        AbstractStudentsBuilder builder = sFactory.createStudentBuilder("sax");
        builder.buildSetStudents("data/students.xml");
        System.out.println(builder.getStudents());
    }
}
