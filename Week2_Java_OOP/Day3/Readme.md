

# 🧬 **Day 3 – Inheritance in Java**

---

## **1️⃣ What is Inheritance?**

**Inheritance** means one class (child) can **use the properties and methods** of another class (parent).
It promotes **code reusability** and **maintains hierarchy** between classes.

### 🧠 Syntax:

```java
class Parent {
    // parent properties and methods
}

class Child extends Parent {
    // child can use all Parent features
}
```

---

## **2️⃣ Example – Basic Inheritance**

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // from Animal
        d.bark(); // from Dog
    }
}
```

🧩 **Output:**

```
Animal is eating...
Dog is barking...
```

---

## **3️⃣ Types of Inheritance in Java**

| Type                                       | Example                         | Supported in Java |
| ------------------------------------------ | ------------------------------- | ----------------- |
| **Single Inheritance**                     | One class inherits another      | ✅                 |
| **Multilevel Inheritance**                 | Class A → Class B → Class C     | ✅                 |
| **Hierarchical Inheritance**               | One parent → multiple children  | ✅                 |
| **Multiple Inheritance (through classes)** | ❌ (Java doesn’t allow directly) |                   |
| **Multiple via Interfaces**                | ✅ (using interfaces)            |                   |

---

### 💡 Example: Multilevel Inheritance

```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
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
```

---

## **4️⃣ super Keyword**

Used to:

1. Call the **parent class constructor**
2. Access **parent methods or variables**

### ✅ Example:

```java
class Animal {
    Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calls Animal constructor
        System.out.println("Dog created");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
```

🧩 **Output:**

```
Animal created
Dog created
```

---

## **5️⃣ Method Overriding**

When a child class defines a method **with the same name and parameters** as in the parent class,
it **replaces (overrides)** the parent method.

### ✅ Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
```

🧩 **Output:**

```
Dog barks
```

---

## **🧩 Practice Tasks**

1. Create a class `Vehicle` → add methods like `start()` and `stop()`.
   Then create a subclass `Car` that adds `honk()`.

2. Use **multilevel inheritance** (`Vehicle → Car → ElectricCar`).

3. Override the `start()` method in `Car`.

4. Add a constructor in both parent and child class and call parent’s constructor using `super()`.

---

