package com.zagurskaya.parsing.entity;

public class Abiturient extends PersonType {
    protected double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double value) {
        this.averageMark = value;
    }
}