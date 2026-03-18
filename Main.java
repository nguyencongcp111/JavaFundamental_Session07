class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Tiếng kêu");
    }
}

class Cat extends Animal {
    String breed;

    void bark() {
        System.out.println("Gâu");
    }
}


class Dog extends Animal {
    String color;

    void meow() {
        System.out.println("Meo");
    }
}



public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.makeSound();
        cat.bark();
        dog.meow();
    }
}