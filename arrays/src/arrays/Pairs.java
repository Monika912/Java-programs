package arrays;

import java.util.Scanner;

public class Pairs {

	static void printAllSubarrays(int[] ar) {
		for(int size = 1;size <= ar.length;size++) {
			Day16.printSubarraysOfK(ar, size);
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printAllSubarrays(ar);

	}

}
