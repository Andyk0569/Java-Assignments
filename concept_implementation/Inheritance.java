package concept_implementation;

class Animal {
    public void makeSound() {
        System.out.println("Animals make sound.");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        // super.makeSound(); // to call the parent method
        System.out.println("Dog Barks!!!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
