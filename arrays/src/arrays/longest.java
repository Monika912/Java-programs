package arrays;

import java.util.Scanner;

public class longest {

	static void printLongestSubarray(int[] arr, int k){
		for(int size = 1;size <= arr.length;size++) {
			for(int i = 0; i <= arr.length-size;i++) {
				int sum = 0;
				for(int j = i;j < i + size;j++) {
					sum = sum + arr[j];
				}
				if(sum == k) {
					for(int j = i;j < i + size;j++) {
						System.out.print(arr[j] +" ");
					}
					System.out.println();
					return;
				}
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int n = scan.nextInt();

		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printLongestSubarray(ar,k);

	}

}
