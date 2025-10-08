class Car{
    String brand;
    String color;
    int year;

    void display() {
        System.out.println("Brand: "+brand+", Color: "+color+", Year: "+year);
    }
}

public class Main{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Red";
        car1.year = 2024;
        car1.display();

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Blue";
        car2.year = 2010;
        car2.display();
    }
}