package com.springbootcamp.demo.springbasics2;



public class Q1TightCoupled {

    public static void main(String[] args) {

        Abc abc = new Abc();

        abc.display();
    }
}

class Abc {

    Xyz xyz;

    public Abc(){
        // xyz tightly coupled to Abc
        xyz = new Xyz();
    }
    public void display(){
        System.out.println("Abc displayed");
        xyz.display();
    }

}

class Xyz{

    public Xyz(){}

    public void display(){
        System.out.println("Xyz displayed");
    }
}

