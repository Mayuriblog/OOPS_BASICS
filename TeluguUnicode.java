public class TeluguUnicode {
    public static void main(String[] args) {
        String text = "అఆఇఈ";
		System.out.println("Length of the text: " + text.length());
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.printf("%c -> U+%04X%n", ch, (int) ch);
        }
    }
}
