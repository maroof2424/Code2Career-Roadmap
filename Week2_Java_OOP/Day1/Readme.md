# 🚀 **Day 1 – Classes & Objects (Java OOP)**

### 🎯 **Goal:**

Understand what **classes** and **objects** are and how to create and use them in Java.

---

## 🧠 **Concepts**

### 1️⃣ **Class**

* A **class** is a blueprint for objects.
* It defines **attributes (variables)** and **behaviors (methods)**.
* Think of it like a **template**.

Example:

```java
class Car {
    String brand;
    String color;
    int year;

    void display() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Year: " + year);
    }
}
```

---

### 2️⃣ **Object**

* An **object** is an **instance** of a class.
* You can create many objects from the same class, each with its own data.

Example:

```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();  // object 1
        car1.brand = "Toyota";
        car1.color = "Red";
        car1.year = 2020;
        car1.display();

        Car car2 = new Car();  // object 2
        car2.brand = "Honda";
        car2.color = "Blue";
        car2.year = 2018;
        car2.display();
    }
}
```

**Output:**

```
Brand: Toyota, Color: Red, Year: 2020
Brand: Honda, Color: Blue, Year: 2018
```

---

## 🔑 **Key Points**

* **Class:** Blueprint/template
* **Object:** Instance of class
* Each object has its **own copy** of the variables
* Methods define the **behavior** of objects

---
