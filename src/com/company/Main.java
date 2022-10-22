/*
 *
 * Classname: Main
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

public class Main {

    public static void main(String[] args) {

        Parallelogram parallelogram = new Parallelogram(10, 10, Math.PI * 0.5);
    
        System.out.println(parallelogram + "\n");
        System.out.println(parallelogram.toXML() + "\n");
        System.out.println(parallelogram.toJSON() + "\n");
        System.out.println(parallelogram.toConsole() + "\n");
    }
}
