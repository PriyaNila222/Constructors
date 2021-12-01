package com.company;

public class Constructor {
     Constructor() {
        System.out.println("I am a default constructor");
    }

    Constructor(int value) {
        System.out.println("I am a one argument constructor with value: " + value);
    }

    Constructor(int value1, int value2) {
        System.out.println("I am a two argument constructor with values: " + value1 + " and " + value2);
    }

    private Constructor(String input) {
        System.out.println(input);

    }

    protected Constructor(String inpu1, String input2) {
        System.out.println(inpu1 + " " + input2);

    }

    public Constructor(String input1, String input2, String input3) {
        System.out.println(input1 + " " + input2 + " " + input3);

    }

    int Constructor(int value) {
         return value;
    }

    String Constructor(String name) {
         return name;
    }

}
