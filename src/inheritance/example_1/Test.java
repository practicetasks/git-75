package inheritance.example_1;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();
        cat.jump();
    }
}
