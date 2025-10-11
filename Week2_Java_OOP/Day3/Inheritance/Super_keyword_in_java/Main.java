class Animal {
    Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
    Dog() {
        super(); 
        System.out.println("Dog created");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
