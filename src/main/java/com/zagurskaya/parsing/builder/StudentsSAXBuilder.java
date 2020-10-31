package com.zagurskaya.parsing.builder;

import java.io.IOException;
import java.util.Set;

import com.zagurskaya.parsing.entity.Student;
import com.zagurskaya.parsing.handler.StudentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class StudentsSAXBuilder extends AbstractStudentsBuilder{
    private Set<Student> students;
    private StudentHandler sh;
    private XMLReader reader;

    public StudentsSAXBuilder() {
// создание SAX-анализатора
        sh = new StudentHandler();
        try {
// создание объекта-обработчика
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(sh);
        } catch (SAXException e) {
            System.err.print("ошибка SAX парсера: " + e);
        }
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void buildSetStudents(String fileName) {
        try {
// разбор XML-документа
            reader.parse(fileName);
        } catch (SAXException e) {
            System.err.print("ошибка SAX парсера: " + e);
        } catch (IOException e) {
            System.err.print("ошибка I/О потока: " + e);
        }
        students = sh.getStudents();
    }
}