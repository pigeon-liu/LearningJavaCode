package com.updata;

abstract class Animal1 {
    public String name;
    abstract public void voice();
    public void eat(){
        System.out.println("eat()!");
    }
}

class Cat1 extends Animal1{
    public void voice() {
        System.out.println("喵");
    }
}
public class Test{
    public static void main(String[] args) {
        Animal1 animal = new Cat1();
        animal.eat();
        animal.voice();
    }
}