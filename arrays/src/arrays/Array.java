package arrays;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] ar = new int[n];
		int sum = 0;
		
		for(int i = 0;i < ar.length;i++) {
			ar[i] = sc.nextInt();
			int res = m > 0 ? m : -m;
			sum = sum + res;
		}
		System.out.println(sum);
	}
}
