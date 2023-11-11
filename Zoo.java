package Poly_With_Objects;

public class Zoo {
    public static void main(String[] args) {
        Animal sasha = new Dog();
        sasha.makeSound();

        boolean isAnimal = sasha instanceof Animal; // instanceof checks to see if the object is an instance of a class
        boolean isDog = sasha instanceof Dog;
        boolean isCat = sasha instanceof Cat;

        if (isAnimal) {
            if (isDog && !isCat) {
                System.out.println("Sasha is a dog, not a cat!");
            } else if (isCat && !isDog) {
                System.out.println("Sasha is a cat, not a dog!");
            } else {
                System.out.println("I am not sure what type of animal Sasha is!");
            }
        } else {
            System.out.println("Sasha is not an animal!");
        }

        sasha = new Cat(); // This is polymorphism
        sasha.makeSound();
        ((Cat)sasha).scratch(); // This is temporary downward typecasting

        Animal bruno = new Dog();
        bruno.makeSound();
        
        Dog brunoTheDog = (Dog)bruno;
        brunoTheDog.fetch(); // This is permanent downward typecasting
    }
}
