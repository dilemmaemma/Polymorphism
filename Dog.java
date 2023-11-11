package Poly_With_Objects;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("bark");
    }

    public void fetch() {
        System.out.println("Dog fetches sticks");
    }
}
