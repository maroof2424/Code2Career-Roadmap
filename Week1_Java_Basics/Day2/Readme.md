

# ⚡ Day 2 – Operators & Expressions in Java

---

## **1. Arithmetic Operators**

Used for math operations.

```java
public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Addition: " + (a + b));        // 13
        System.out.println("Subtraction: " + (a - b));     // 7
        System.out.println("Multiplication: " + (a * b));  // 30
        System.out.println("Division: " + (a / b));        // 3 (integer division)
        System.out.println("Modulo: " + (a % b));          // 1 (remainder)
    }
}
```

👉 If you want decimals, use **double**:

```java
System.out.println((10.0 / 3)); // 3.333...
```

---

## **2. Assignment Operators**

Used to assign and update variables.

```java
public class AssignmentDemo {
    public static void main(String[] args) {
        int x = 5;

        x += 3; // x = x + 3 → 8
        x -= 2; // x = x - 2 → 6
        x *= 4; // x = x * 4 → 24
        x /= 6; // x = x / 6 → 4
        x %= 3; // x = x % 3 → 1

        System.out.println("Final value of x: " + x);
    }
}
```

---

## **3. Comparison Operators**

These return **true or false**.

```java
public class ComparisonDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a > b);   // false
        System.out.println(a < b);   // true
        System.out.println(a >= 10); // true
        System.out.println(b <= 20); // true
    }
}
```

---

## **4. Logical Operators**

Used for conditions.

```java
public class LogicalDemo {
    public static void main(String[] args) {
        int age = 18;
        boolean hasID = true;

        // AND: both must be true
        System.out.println(age >= 18 && hasID); // true

        // OR: at least one must be true
        System.out.println(age >= 21 || hasID); // true

        // NOT: reverses result
        System.out.println(!(age >= 18)); // false
    }
}
```

---

# 🎯 Exercises for You

Try solving these with the operators:

1. Write a program to check if a number is **even or odd**.
2. Compare **three numbers** and print the largest.
3. Write a program to check if a person can **vote** (age ≥ 18 AND has ID).
4. Divide 2 numbers and print both the **quotient** and **remainder**.

---

