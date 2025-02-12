public class Demo083 {
    public static void main(String[] args) {
        String name = "Anirudh";
        String lowerString = name.toLowerCase();
        char ch = lowerString.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("Not a vowel");
        }
    }
}