public class Stringbasics {
    public static void main(String[] args) {
        String text = "JavaRocks";

        System.out.println("Length: " + text.length());
        System.out.println("Character at index 2: " + text.charAt(2));
        System.out.println("Substring(0,4): " + text.substring(0, 4));
        System.out.println("Concatenation: " + text.concat("!"));
    }
}
