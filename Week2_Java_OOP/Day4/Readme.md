

# 🧠 **Day 4 – Polymorphism**

---

## **1️⃣ What is Polymorphism?**

> “Poly” = many, “Morphism” = forms → **many forms of the same thing**.
> In Java, polymorphism allows one interface to be used for **different data types or behaviors**.

It helps you write **flexible, reusable, and scalable** code.

---

## **2️⃣ Types of Polymorphism**

| Type                      | Description        | Example                                |
| ------------------------- | ------------------ | -------------------------------------- |
| **Compile-time (Static)** | Method Overloading | Same method name, different parameters |
| **Runtime (Dynamic)**     | Method Overriding  | Same method in parent & child class    |

---

## **3️⃣ Compile-Time Polymorphism (Method Overloading)**

✅ Example:

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));       // int
        System.out.println(calc.add(5.5, 10.2));   // double
        System.out.println(calc.add(1, 2, 3));     // 3 params
    }
}
```

🧩 **Concept:**
The compiler decides **which method to call** based on **number/type of arguments**.

---

## **4️⃣ Runtime Polymorphism (Method Overriding)**

✅ Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
    }
}
```

🧠 **Concept:**
Which method runs depends on **the object**, not the reference type → that’s why it’s called **runtime polymorphism**.

---

## **5️⃣ `super` Keyword in Overriding**

Use `super.methodName()` to call the **parent method** from the overridden one.

✅ Example:

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    void start() {
        super.start(); // Call parent version
        System.out.println("Car engine started!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
```

---

## **🧩 Practice Tasks**

1. Create a `Shape` class with a `draw()` method, and subclasses:

   * `Circle`, `Square`, `Triangle`
     Override `draw()` in each.

2. Create a `Bank` class with a `getInterestRate()` method.
   Subclasses: `HBL`, `UBL`, `MCB` — each returns a different rate.

3. Create a program showing **method overloading** and **method overriding** in one example.

---