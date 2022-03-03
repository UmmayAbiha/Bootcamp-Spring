package com.springbootcamp.demo.springbasics2;

public class Q2LooseCoupled {
    public static void main(String[] args) {

        Show a = new A();
        Show b = new B();

        D d = new D(a);
        // will print a and d
        d.display();

        D d1 = new D(b);
        // will print b and d
        d1.display();


    }
}
class A implements Show{

    public A(){}


    @Override
    public void display() {
        System.out.println("A displayed");

    }
}

class D {
    Show s;
    // s is loosely coupled to D
    public D(Show s){
        this.s = s;
    }

    public void display(){
        System.out.println("D displayed");
        s.display();
    }

}

class B implements Show{

    public B(){}

    @Override
    public void display() {
        System.out.println("B displayed");

    }
}


interface Show{
    public void display();
}
