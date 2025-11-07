import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String s1 = sc.nextLine();
		System.out.print("Enter string2: ");
		String s2 = sc.nextLine();		
				
		if(s1 == s2)
			System.out.println("Both addresses are equal");
		else
			System.out.println("Both addresses are different");
		
		if(s1.equals(s2))
			System.out.println("Both contents are equal");
		else
			System.out.println("Both contents are different");
		
		String s3 = "Java";
		String s4 = "Java";
		
		if(s3 == s4)
			System.out.println("Both addresses are equal");
		else
			System.out.println("Both addresses are different");
		
		if(s3.equals(s4))
			System.out.println("Both contents are equal");
		else
			System.out.println("Both contents are different");
	}
}