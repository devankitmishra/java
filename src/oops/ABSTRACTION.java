package oops;
abstract class Animal{
    abstract void walk();
    Animal() {
        System.out.println("You are creating a new Animal");
    }
    public void ear(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("walks os 2 legs");
    }
}


public class ABSTRACTION {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
