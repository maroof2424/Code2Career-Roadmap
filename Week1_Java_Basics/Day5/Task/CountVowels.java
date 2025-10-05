public class CountVowels {
    public static void main(String[] args) {
        String text = "Programming is fun";
        int count = 0;
        for (int i = 0; i < text.length();i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total Vowels: " + count);
    }
}
