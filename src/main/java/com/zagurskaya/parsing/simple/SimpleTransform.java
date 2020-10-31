package com.zagurskaya.parsing.simple;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class SimpleTransform {
    public static void main(String[] args) {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
// установка используемого XSL-преобразования
            Transformer transformer = tf.newTransformer(new StreamSource("data/students.xsl"));
// установка исходного XML-документа и конечного XML-файла
            transformer.transform(new StreamSource("data/students.xml"),
                    new StreamResult("data/newstudents.xml"));
//            System.out.println("Transform " + fileName + " complete");
        } catch (TransformerException e) {
//            System.err.println("Impossible transform file " + fileName + " : " + ex);
        }
    }
}