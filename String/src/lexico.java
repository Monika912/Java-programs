import java.util.Scanner;

public class lexico {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read the input strings
	        String s1 = scanner.nextLine();
	        String s2 = scanner.nextLine();
	        
	        // Calculate the sum of lengths
	        int sumOfLengths = s1.length() + s2.length();
	        
	        // Compare lexicographic order
	        boolean isLexicographicallyGreater = s1.compareTo(s2) > 0;
	        
	        // Capitalize the first letter of both strings
	        String capitalizedS1 = capitalizeFirstLetter(s1);
	        String capitalizedS2 = capitalizeFirstLetter(s2);
	        
	        // Print the output
	        System.out.println(sumOfLengths);
	        System.out.println(isLexicographicallyGreater ? "Yes" : "No");
	        System.out.println(capitalizedS1 + " " + capitalizedS2);
	        
	        scanner.close();
	    }
	    
	    // Helper method to capitalize the first letter of a string
	    private static String capitalizeFirstLetter(String s) {
	        if (s.isEmpty()) {
	            return s;
	        }
	        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	    }
	}


