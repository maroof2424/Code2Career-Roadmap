

# ⚡ Day 3 – Loops in Java

---

## **1. for loop**

👉 Best when you know **how many times** you want to repeat.

**Syntax:**

```java
for(initialization; condition; update) {
    // code to run
}
```

**Example:**

```java
public class ForLoopDemo {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
```

---

## **2. while loop**

👉 Best when you **don’t know the exact number of times**, but you keep looping **as long as the condition is true**.

**Syntax:**

```java
while(condition) {
    // code to run
}
```

**Example:**

```java
public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            System.out.println("i = " + i);
            i++;
        }
    }
}
```

---

## **3. do-while loop**

👉 Same as while loop, but it **runs at least once** even if condition is false.

**Syntax:**

```java
do {
    // code to run
} while(condition);
```

**Example:**

```java
public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while(i <= 5);
    }
}
```

---

# 🎯 Practice Problems

---

### ✅ 1. Print numbers 1–50

```java
public class Numbers1to50 {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }
    }
}
```

---

### ✅ 2. Multiplication table of any number

```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
```

---

### ✅ 3. Sum of first 10 numbers

```java
public class SumFirst10 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers = " + sum);
    }
}
```

---

⚡ **Quick Tip:**

* Use **for loop** when you know the range (like 1–50, tables).
* Use **while/do-while** when looping depends on a condition (like keep asking until user enters correct password).

---

