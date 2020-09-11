package com.zakilive.ooplearningbyme;

public class Homosapiens {

    String continent;
    String name;
    int age;
    String eye_color;
    String hair_color;
    String sex;

    public Homosapiens() {

        //it is constructor, it helps to build new homosapiens as object creation
    }

    public void Speak() {
        System.out.println("Hi, I am human!");
        System.out.println("My name is " + name);
        System.out.println("I am " + sex);
        System.out.println("My name age is " + age);
        System.out.println("My eye color is " + eye_color);
        if (eye_color.equals(hair_color)) {
            System.out.println("My hair color is also " + hair_color);
        } else {
            System.out.println("My hair color is " + hair_color);

        }

        System.out.println("I am from " + continent + " continent");
    }


}
