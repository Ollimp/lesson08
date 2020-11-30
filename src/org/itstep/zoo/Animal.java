package org.itstep.zoo;


public class Animal {
    private final String nickName;
    private final int age;
    private final int weight;

    public Animal(String nickName, int age, int weight) {
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
    }

    public void say() {
        System.out.println("???");
    }

//    @Override
    public String toStrin() {
        return nickName + " " + age + " years old";
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bobik", 3, 15);
        dog.say();
        System.out.println(dog);
    }
}

class Mammal extends Animal {
    public static final boolean LUNGS = true;

    Mammal(String nickName, int age, int weight) {
        super(nickName, age, weight);
    }
}

class Dog extends Mammal {

    @Override
    public void say() {
        System.out.println("Gav");
    }

    Dog(String nickName, int age, int weight) {
        super(nickName, age, weight);
    }
}

class Cat  extends Mammal {
    Cat(String nickName, int age, int weight) {
        super(nickName, age, weight);
    }

    @Override
    public void say() {
        System.out.println("Mau");
    }
}

class Fish extends Animal {

    public Fish(String nickName, int age, int weight) {
        super(nickName, age, weight);
    }
}