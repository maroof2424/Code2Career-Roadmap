# Day 5

---

## 🧠 **What is a String in Java?**

A **String** is basically **a sequence of characters** — like `"Hello"`, `"Java"`, or `"12345"`.
But in Java, strings are **objects**, not primitive data types.

Example:

```java
String name = "Maroof";
```

This creates a `String` object stored in memory.

---

## ⚙️ **String Declaration & Basic Operations**

### 1️⃣ **Declaration**

You can declare a string in two ways:

```java
String s1 = "Java";                // literal (stored in String pool)
String s2 = new String("Java");    // object (stored in heap)
```

---

### 2️⃣ **Common Operations**

| Method                  | Description                           | Example                         | Output       |
| ----------------------- | ------------------------------------- | ------------------------------- | ------------ |
| `length()`              | Returns total number of characters    | `"Java".length()`               | `4`          |
| `charAt(index)`         | Returns character at a specific index | `"Java".charAt(1)`              | `a`          |
| `substring(start, end)` | Extracts part of a string             | `"Programming".substring(0, 5)` | `Progr`      |
| `concat(str)`           | Joins two strings                     | `"Hello".concat("World")`       | `HelloWorld` |

---

## ⚖️ **String Comparison**

This part *confuses almost everyone* at first 😅
Because Java compares **references** and **values** differently.

### ✅ `.equals()` → compares **content**

```java
String a = "hello";
String b = new String("hello");

System.out.println(a.equals(b));  // ✅ true (same content)
```

### ⚠️ `==` → compares **memory location**

```java
String a = "hello";
String b = new String("hello");

System.out.println(a == b);       // ❌ false (different memory)
```

> 🧩 Rule: **Always use `.equals()`** for comparing text.

---

## 🔁 **Looping through a String**

You can loop through every character using a simple `for` loop:

```java
String word = "Java";
for (int i = 0; i < word.length(); i++) {
    System.out.println(word.charAt(i));
}
```

Output:

```
J
a
v
a
```

---

## ⚡ Quick Recap

| Concept         | Description                    | Example                             |
| --------------- | ------------------------------ | ----------------------------------- |
| **String**      | Sequence of characters         | `"Hello"`                           |
| **Immutable**   | Once created, can’t be changed | `s1.concat("X")` creates new string |
| **length()**    | Count characters               | `"Java".length()` → `4`             |
| **charAt()**    | Get single char                | `"Java".charAt(0)` → `J`            |
| **substring()** | Slice string                   | `"Hello".substring(1,4)` → `ell`    |
| **equals()**    | Compare content                | `"a".equals("a")` → true            |
| **==**          | Compare memory                 | `"a" == "a"` → maybe true or false  |

---
