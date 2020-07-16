package first;

class Animal {
    /*public void eat(String food){
        System.out.println(this.name +"正在吃"+food);
    }
    public Animal(String name){
        this.name = name;
    }*/
    public void voice(){

    }
}

class Cat extends Animal{
    @Override
    public void voice(){
        System.out.println("喵");
    }
}
class Dog extends Animal{
    /*public Dog(String name){
        super(name);
    }*/
    @Override
    public void voice(){
        System.out.println("汪汪");
    }

}
class Sheep extends Animal{
    /*public Dog(String name){
        super(name);
    }*/
    @Override
    public void voice(){
        System.out.println("咩");
    }

}

public class TestDemo{
    public static void main(String[] args) {
        /*Cat cat = new Cat("猫咪");
        cat.eat("猫粮");
        Dog dog = new Dog("旺柴");
        dog.eat("骨头");*/
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Sheep();
        animal1.voice();
        animal2.voice();
        animal3 .voice();

    }
}


