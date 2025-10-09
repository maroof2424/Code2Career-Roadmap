// // class Student {
// //     String name;
// //     int age;

// //     // Constructor
// //     Student(String n, int a) {
// //         name = n;
// //         age = a;
// //     }

// //     void showDetails() {
// //         System.out.println("Name: " + name + ", Age: " + age);
// //     }
    
// // }

// // public class Main {
// //     public static void main(String[] args) {
// //         Student s1 = new Student("Maroof", 19);
// //         s1.showDetails();
// //     }
// // }
// class Display {
//     void show(String name) {
//         System.out.println("Name: " + name);
//     }

//     void show(String name, int age) {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Display d = new Display();
//         d.show("Maroof");       // calls first method
//         d.show("Maroof", 19);   // calls second method
//     }
// }
class Person {
    String name;

    Person(String name) {
        this.name = name; // 'this.name' = class variable, 'name' = parameter
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Maroof");
        p.display();
    }
}
