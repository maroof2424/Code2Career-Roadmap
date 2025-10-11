class Calculator_class {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculator_class calc = new Calculator_class();
        System.out.println(calc.add(5, 10));       // int
        System.out.println(calc.add(5.5, 10.2));   // double
        System.out.println(calc.add(1, 2, 3));     // 3 params
    }
}
