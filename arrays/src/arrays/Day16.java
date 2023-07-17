package arrays;

import java.util.Scanner;

public class Day16 {
	static void printSubarraysOfK(int[] arr, int size) {
		for(int i = 0; i <= arr.length-size;i++) {
			for(int j = i;j < i + size;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
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
		int size = scan.nextInt();
		printSubarraysOfK(ar,size);
	}

}
