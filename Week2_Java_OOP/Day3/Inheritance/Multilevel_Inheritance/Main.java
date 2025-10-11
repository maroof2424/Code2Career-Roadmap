class Animal {
    void eat() {
        System.out.println("Animal eating ...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is Barking ...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping ...");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}