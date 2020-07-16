package com.updata;

interface Shape{
    public void draw();
}

class Cycle implements Shape{
    @Override
    public void draw(){
        System.out.println("画了一个○");
    }
}
class Rhombus implements Shape{
    @Override
    public void draw() {
        System.out.println("画了一个♦");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new Rhombus();
        shape1.draw();
        shape2.draw();
    }
}
