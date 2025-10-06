
# 🚀 Day 6 – Mini Project: Simple Calculator

## 🎯 **Goal**
Build a simple calculator that:
- Takes two numbers as input  
- Lets the user choose an operation (+, -, *, /)  
- Displays the result  
- Handles divide-by-zero errors  
- Allows multiple calculations until the user decides to exit  

---

## 🧠 **Concepts Used**
- **Scanner class** → for user input  
- **Switch / If-Else** → for operation selection  
- **Loop (do-while)** → to repeat until user exits  
- **Basic arithmetic** → +, -, *, /  

---

## 💻 **Code Example**

```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation: +  -  *  /");
            char op = sc.next().charAt(0);

            double result = 0;
            boolean valid = true;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("⚠️ Error: Cannot divide by zero!");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("❌ Invalid operation!");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
            System.out.println("---------------------------");

        } while (choice == 'y' || choice == 'Y');

        System.out.println("👋 Calculator closed. Goodbye!");
        sc.close();
    }
}
````

---

## 🧩 **How It Works**

1. Takes two numbers from the user
2. Asks for an operation (`+`, `-`, `*`, `/`)
3. Calculates and prints result
4. Checks if user wants to continue
5. Repeats until user exits

---

## ⚡ **Sample Output**

```
Enter first number: 10
Enter second number: 5
Choose operation: *
Result: 50.0
Do you want to continue? (y/n): y
---------------------------
Enter first number: 12
Enter second number: 0
Choose operation: /
⚠️ Error: Cannot divide by zero!
Do you want to continue? (y/n): n
👋 Calculator closed. Goodbye!
```

---

## 💪 **Practice Ideas**

* Add modulus `%` and power `^` operations
* Allow multiple number inputs
* Handle invalid input using `try-catch`
* Store calculation history and show it at the end

---

✅ **Project Folder:**
`Week1_Java_Basics/Day6/Project`

✅ **Filename:**
`SimpleCalculator.java`

---

