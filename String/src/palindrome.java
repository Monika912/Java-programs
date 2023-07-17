import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String rev = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}
	}
}
