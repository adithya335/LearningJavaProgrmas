package July3Tasks.MethodOverRiding;

public class Animal {

    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal dog=new Dog();
        Animal cat=new Cat();
        Animal cow=new Cow();
        animal.sound();
        dog.sound();
        cat.sound();
        cow.sound();
    }

    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow");
    }
}

class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Moo");
    }
}
