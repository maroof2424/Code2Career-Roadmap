package Day3.Inheritance.Basic_Inheritance;
class Animal {
    void eat() {
        System.out.println("Animal eating ...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is Barding...");
    }
}

public class Main {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}