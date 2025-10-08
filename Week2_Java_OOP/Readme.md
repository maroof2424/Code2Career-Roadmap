# 🚀 Week 2 – Object-Oriented Programming (OOP) in Java

### **Goal:**

Understand **Classes, Objects, Methods, Constructors, Inheritance, Polymorphism, Encapsulation, Abstraction**, and apply them in a **Student Management System** using `ArrayList`.

---

## **Day 1 – Classes & Objects**

**Concepts:**

* A **Class** is a blueprint for objects.
* An **Object** is an instance of a class.

**Example:**

```java
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();  // creating object
        s1.name = "Maroof";
        s1.age = 20;
        s1.display();
    }
}
```

**Practice:**

* Create a `Car` class with `model` and `price` attributes, print details using objects.

---

## **Day 2 – Constructors & Methods**

**Concepts:**

* **Constructor:** Special method to initialize objects.
* **Methods:** Functions inside classes.

**Example:**

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

**Practice:**

* Add a method `isAdult()` returning true if age ≥ 18.

---

## **Day 3 – Inheritance**

**Concepts:**

* **Inheritance:** A class (child) can inherit properties & methods from another class (parent).
* Use `extends` keyword.

**Example:**

```java
class Person {
    String name;
    void greet() {
        System.out.println("Hello, " + name);
    }
}

class Student extends Person {
    int rollNo;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Maroof";
        s1.rollNo = 101;
        s1.greet();
        System.out.println("Roll No: " + s1.rollNo);
    }
}
```

**Practice:**

* Create `Teacher` class inheriting from `Person`, add subject attribute.

---

## **Day 4 – Polymorphism**

**Concepts:**

* **Polymorphism:** One thing, multiple forms.

  * **Compile-time (Method Overloading):** Same method name, different parameters.
  * **Runtime (Method Overriding):** Child class modifies parent’s method.

**Example (Overloading):**

```java
class Calculator {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
```

**Example (Overriding):**

```java
class Person {
    void greet() { System.out.println("Hello"); }
}

class Student extends Person {
    @Override
    void greet() { System.out.println("Hello, I am a student"); }
}
```

---

## **Day 5 – Encapsulation & Abstraction**

**Concepts:**

* **Encapsulation:** Hide data using `private` and provide `getter`/`setter`.
* **Abstraction:** Hide implementation using abstract class or interface.

**Example (Encapsulation):**

```java
class Student {
    private int age;
    public void setAge(int a) { age = a; }
    public int getAge() { return age; }
}
```

**Example (Abstraction):**

```java
abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    int radius;
    Circle(int r) { radius = r; }
    void area() { System.out.println("Area: " + 3.14 * radius * radius); }
}
```

---

## **Day 6-7 – Mini Project: Student Management System**

**Requirements:**

* Use `ArrayList<Student>` to store students
* Add, update, delete students
* Each student: `id`, `name`, `age`, `grade`
* Menu-based console input

**Example Skeleton:**

```java
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String grade;

    Student(int id, String name, int age, String grade){
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display(){
        System.out.println(id + " | " + name + " | " + age + " | " + grade);
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Implement menu here: add, update, delete, view
    }
}
```

**Pro Tip:**

* Using `ArrayList` is better than arrays because it **resizes dynamically**.
* Later, you can link this to a **file or database** for persistent storage.

---
