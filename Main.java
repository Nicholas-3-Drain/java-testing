public class Main {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        Cat kidde = new Cat();
        Bird fur = new Bird();

        doggy.greet();
        kidde.greet();
        fur.greet();
    }
}

interface Animal {
    void greet();
}

class Dog implements Animal {
    public void greet() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void greet() {
        System.out.println("Meow!");
    }
}

class Bird implements Animal {
    public void greet() {
        System.out.println("Tweet!");
    }
}