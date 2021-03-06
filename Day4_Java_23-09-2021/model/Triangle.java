package com.torryharris.model;

public class Triangle extends Shape {
    private int length;
    private int height;

    public Triangle(int length, int height) {
        this.length = length;
        this.height = height;
        setNoOfSides(3);
    }

    @Override
    public void area() {
        System.out.println("Area of Triangle is: "+(length*height/2));
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
