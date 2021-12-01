package com.company;

//Call the constructors(both default and argument constructors) of super class from a child class

public class Program2 extends Constructor {
    public static void main(String[] args) {
        Program2 object1 = new Program2();
        Program2 object2 = new Program2(1);
        Program2 object3 = new Program2(2, 3);
    }

    Program2() {
        super();
    }

    Program2(int value) {
        super(1);
    }

    Program2(int value1, int value2) {
        super(value1, value2);
    }
}
