package com.CalRest.restcal.model;

public class Caluclate {
    private String x;
    private String y;
    private String cal;

    public Caluclate(String num1, String num2, String operator){
        this.x = num1;
        this.y = num2;
        this.cal = operator;
    }
}