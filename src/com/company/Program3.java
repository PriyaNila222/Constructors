package com.company;

//Apply private, public, protected and default access modifiers to the constructor

public class Program3 {
    public static void main(String[] args) {
        Constructor object1 = new Constructor();
        /*
        Constructor object2 = new Constructor("Hello");
        (Not possible because Constructor with one string argument is declared as PRIVATE)
         */
        Constructor object3 = new Constructor("Shanmuga", "Priya");
        Constructor object4 = new Constructor("Shanmuga", "Priya", "R");
    }
}
