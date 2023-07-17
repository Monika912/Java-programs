import java.util.Scanner;

public class substring {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read the input string
	        String s = scanner.nextLine();
	        
	        // Read the input integer
	        int k = scanner.nextInt();
	        
	        // Find the smallest and largest substrings of length k
	        String smallestSubstring = "";
	        String largestSubstring = "";
	        
	        for (int i = 0; i <= s.length() - k; i++) {
	            String substring = s.substring(i, i + k);
	            
	            if (smallestSubstring.isEmpty() || substring.compareTo(smallestSubstring) < 0) {
	                smallestSubstring = substring;
	            }
	            
	            if (largestSubstring.isEmpty() || substring.compareTo(largestSubstring) > 0) {
	                largestSubstring = substring;
	            }
	        }
	        
	        // Print the output
	        System.out.println(smallestSubstring);
	        System.out.println(largestSubstring);
	        
	        scanner.close();
	    }
	}

