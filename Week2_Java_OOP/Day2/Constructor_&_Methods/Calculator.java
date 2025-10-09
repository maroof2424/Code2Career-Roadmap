class Calculator_class {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculator_class calc = new Calculator_class();
        System.out.println("Sum: " + calc.add(3, 5));
        System.out.println("Product: " + calc.multiply(3, 5));
    }
}
