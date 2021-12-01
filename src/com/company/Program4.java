package com.company;

//Write constructors with return type int and String

public class Program4 {
    public static void main(String[] args) {
        Constructor object = new Constructor();
        int number = object.Constructor(10);
        System.out.println("Number: " + number);
        String name = object.Constructor("Priya");
        System.out.println("Name: " + name);
    }
}
