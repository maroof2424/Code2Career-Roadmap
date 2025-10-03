
public class Logical {
    public static void main(String[] args) {
        int age = 18;
        boolean hasID = true;

        System.out.println(age >= 18 && hasID); // true
        System.out.println(age >= 21 || hasID); // true
        System.out.println(!(age >= 18)); // false
    }
}
