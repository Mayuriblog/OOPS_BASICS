public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original: " + sb);

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        sb.replace(0, 4, "Learn");
        System.out.println("After replace: " + sb);

        sb.delete(5, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.reverse(); // Undo reverse
        sb.setCharAt(0, 'T');
        System.out.println("After setCharAt: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("As String: " + sb.toString());
    }
}
