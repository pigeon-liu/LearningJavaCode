package com.updata;
/*class Animal{
    public String name;
    public  Animal(String name){
        this.name = name;
    }
}

interface IFly{
    void fly();
}
interface  ISwimming{
    void swim();
}
interface IRunning{
    void run();
}

class Cat extends Animal implements IRunning{
    public Cat(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(name + "正在用四条腿跑");
    }
}
class Bird extends Animal implements IFly{
    public Bird(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name+"正在飞");
    }
}
class Duck extends Animal implements IFly,IRunning,ISwimming{
    public Duck(String name){
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(name+"会飞");
    }
    @Override
    public void run(){
        System.out.println(name+"会跑");
    }
    @Override
    public void swim(){
        System.out.println(name+"会游");
    }
}*/

interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}
// 两栖的动物, 既能跑, 也能游
interface IAmphibious extends IRunning, ISwimming {
}
class Frog implements IAmphibious {
    @Override
    public void run() {
        System.out.println("会跑");
    }
    @Override
    public void swim() {
        System.out.println("会游");
    }
}
public class Demo {
    public static  void walk(IRunning running){
        System.out.println("我在散步~");
        running.run();
    }
    public static void main(String[] args) {
        /*Cat cat = new Cat("猫咪");
        walk(cat);
        Duck duck = new Duck("鸭子");
        walk(duck);*/
        Frog frog = new Frog();


    }
}
