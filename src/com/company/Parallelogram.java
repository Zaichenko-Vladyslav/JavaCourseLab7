/*
 *
 * Classname: Parallelogram
 *
 * 07 June 2020
 *
 * Copyright Zaichenko Vladyslav KNUTE
 *
 * Module 2 task 3
 *
 * Polymorphism
 * Create and implement two interfaces for your class
 *
 */

package com.company;

public class Parallelogram implements IGeometry, IPackaging {

    private int bigSide;
    private int smallSide;
    private double angle;

    // Constructors for class Parallelogram

    public Parallelogram() {

    }

    public Parallelogram(int bigSide, int smallSide, double angle) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
        this.angle = angle;
    }

    // Getters and setters for class Parallelogram

    public int getBigSide() {
        return bigSide;
    }

    public void setBigSide(int bigSide) {
        this.bigSide = bigSide;
    }

    public int getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(int smallSide) {
        this.smallSide = smallSide;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    // Methods for class Parallelogram

    // Method getArea() for class Parallelogram

    @Override
    public double getArea() {
        return this.getBigSide() * this.getSmallSide() * Math.sin(this.getAngle());
    }

    // Method getLinearLength() for class Parallelogram

    @Override
    public double getLinearLength() {
        return 2 * (this.getSmallSide() + this.getBigSide());
    }

    // Method toJSON() for class Parallelogram

    @Override
    public String toJSON() {
        String json = "Parallelogram {"
                + "\""  + "biggestSide\": " + this.getBigSide()
                + ", "
                + "\""  + "smallerSide\": " + this.getSmallSide()
                + ", "
                + "\""  + "angle\": " + this.getAngle()
                + ", "
                + "\""  + "linearLength\": " + this.getLinearLength()
                + ", "
                + "\""  + "area\": " + this.getArea()
                + "}";
        return json;
    }

    // Method toXML() for class Parallelogram

    @Override
    public String toXML() {
        String xml = "<Parallelogram>"
                + "<biggestSide>" + this.getBigSide() + "</biggestSide>"
                + "<smallerSide>" + this.getSmallSide() + "</smallerSide>"
                + "<angle>" + this.getAngle() + "</angle>"
                + "<linearLength>" + this.getLinearLength() + "</linearLength>"
                + "<area>" + this.getArea() + "</area>"
                +  "</Parallelogram>";
        return xml;
    }

    // Method toConsole() for class Parallelogram

    @Override
    public String toConsole() {
        return "Parallelogram {" + "\n" +
                "Big Side = " + this.getBigSide() + "," + "\n" +
                "Small Side = " + this.getSmallSide() + "," + "\n" +
                "Angle = " + this.getAngle() + "," + "\n" +
                "Linear Length = " + this.getLinearLength() + "," + "\n" +
                "Area = " + this.getArea() +
                "\n" + '}';
    }

    // Method toString() for class Parallelogram

    @Override
    public String toString() {
        return "Parallelogram {" +
                "Big Side = " + this.getBigSide() +
                ", Small Side = " + this.getSmallSide() +
                ", Angle = " + this.getAngle() +
                ", Linear Length = " + this.getLinearLength() +
                ", Area = " + this.getArea() +
                '}';
    }
}
