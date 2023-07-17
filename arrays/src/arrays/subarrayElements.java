package arrays;

import java.util.Scanner;

public class subarrayElements {

   static void printSubarrayElements(int[] arr, int size, int k) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= arr.length-size;i++) {
			int sum = 0;
			for(int j = i; j < i + size;j++) {
				sum = sum + arr[j];
			}
			if(sum == k) {
				for(int j = i;j < i + size;j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
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
		
		int k = scan.nextInt();
		
		printSubarrayElements(ar,size,k);

	}
}
