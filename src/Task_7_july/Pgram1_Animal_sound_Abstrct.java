package Task_7_july;

class Pgram1_Animal_sound_Abstrct
{
    public static void main(String[] args) {

Animal obj1= new Dog();
obj1.makeSound();

Animal obj2 = new Cat();
obj2.makeSound();

    }
}
abstract class Animal
{
    abstract void  makeSound();
}
 class Dog extends Animal
{
    void makeSound()
    {
        System.out.println(" Dog barks");
    }

}
 class Cat extends Animal
{
    void makeSound()
    {
        System.out.println(" Cat meows");
    }
}

