

---

# 🧱 **Day 2 – Constructors & Methods**

---

## **1️⃣ What is a Constructor?**

A **constructor** is a special method used to **initialize objects**.

### ✨ Key Points:

* Constructor name = Class name
* No return type (not even `void`)
* Automatically called when an object is created

### ✅ Example:

```java
class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Maroof", 20);
        s1.display();
    }
}
```

---

## **2️⃣ Types of Constructors**

| Type                          | Description                                 | Example                         |
| ----------------------------- | ------------------------------------------- | ------------------------------- |
| **Default Constructor**       | No parameters, auto-created if none defined | `Student() { }`                 |
| **Parameterized Constructor** | Takes arguments                             | `Student(String name, int age)` |
| **Copy Constructor**          | Copies data from another object             | `Student(Student s)`            |

---

## **3️⃣ Method Overloading**

Method overloading = same method name, **different parameters**.

### ✅ Example:

```java
class Display {
    void show(String name) {
        System.out.println("Name: " + name);
    }

    void show(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Display d = new Display();
        d.show("Maroof");
        d.show("Maroof", 20);
    }
}
```

🧠 **Concept:**
Compiler decides which method to call **based on parameters** (number, type, or order).

---

## **4️⃣ Using `this` Keyword**

Used when method or constructor parameters have **the same name** as instance variables.

### ✅ Example:

```java
class Person {
    String name;

    Person(String name) {
        this.name = name; // 'this' refers to the instance variable
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Maroof");
        p1.display();
    }
}
```

---

## **🧩 Practice Tasks**

1. Create a `Car` class with:

   * Fields: `brand`, `model`, `price`
   * Parameterized constructor
   * Method to display details

2. Create multiple constructors using **constructor overloading**

3. Use `this` keyword inside constructor and method

---

