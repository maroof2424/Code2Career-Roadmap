

# ⚡ Day 4 – Arrays in Java

---

## **1. Declaring and Initializing Arrays**

### ✅ Way 1: Declare first, then assign values

```java
int[] numbers = new int[5]; // create an array with 5 elements
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

System.out.println(numbers[2]); // prints 30
```

---

### ✅ Way 2: Declare + initialize together

```java
int[] nums = {10, 20, 30, 40, 50};
System.out.println(nums[0]); // prints 10
System.out.println(nums.length); // prints 5
```

🧠 *Remember:*

* Array index starts from **0**.
* Last index = `length - 1`.

---

## **2. Looping Through an Array**

```java
public class ArrayLoop {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25};

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Element at index " + i + ": " + nums[i]);
        }
    }
}
```

---

## **3. Basic Array Operations**

### ✅ Sum of Array Elements

```java
public class ArraySum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Sum = " + sum);
    }
}
```

---

### ✅ Average of Array Elements

```java
public class ArrayAverage {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int num : nums) {  // enhanced for loop
            sum += num;
        }

        double average = (double) sum / nums.length;
        System.out.println("Average = " + average);
    }
}
```

---

### ✅ Find the Largest Element

```java
public class MaxInArray {
    public static void main(String[] args) {
        int[] nums = {4, 9, 1, 12, 7};
        int max = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Largest element = " + max);
    }
}
```

---

# 🎯 Practice Tasks

1. Create an array of 5 numbers.
   → Print all elements, find **sum** and **average**.
2. Find the **largest element** in an array.
3. (Bonus) Find the **smallest element** in an array.
4. (Bonus) Print the array in **reverse order**.

---

💡 **Pro Tips:**

* Arrays have a **fixed size** → once created, can’t resize it.
* Use **loops** (for or for-each) for efficient operations.
* For dynamic lists, later you’ll learn **ArrayList** (in OOP week).

---
