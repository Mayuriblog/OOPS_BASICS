public class UnicodeExample {
    public static void main(String[] args) {
        String s = "@";

        System.out.println("Character: " + s);
        System.out.println("Unicode code point: " + s.codePointAt(0));
        System.out.println("Hex form: U+" + Integer.toHexString(s.codePointAt(0)).toUpperCase());
    }
}