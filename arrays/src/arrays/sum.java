package arrays;

import java.util.Scanner;

public class sum {
	static void printSumOfSubarrays(int[] arr, int size) {
		for(int i = 0; i <= arr.length-size;i++) {
			int sum = 0;
			for(int j = i;j < i+size;j++) {
				sum = sum + arr[j];
			}
			System.out.println(sum);
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
		
		printSumOfSubarrays(ar,size);

	}

}
