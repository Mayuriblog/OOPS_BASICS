public class StringVsStringBuffer {
    public static void main(String[] args) {
        // Strings are Immutable
        String s = "Hello";
        s.concat(" World");
		String s1 = s.concat(" World");
        System.out.println("String1: " + s);  
		System.out.println("String2: " + s1);
		
        // StringBuffer is Mutable
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer: " + sb);  
    }
}
