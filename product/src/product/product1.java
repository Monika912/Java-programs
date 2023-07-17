package product;

import java.util.Scanner;

public class product1 {
	static long[] productArray(int[] ar) {
		long p = 1;
		for(int i = 0;i < ar.length;i++) {
			p = p * ar[i];
		}
		long res[] = new long[ar.length];
		
		for(int i = 0;i < ar.length;i++) {
			res[i] = p / ar[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] ar = new int[N];
		
		for(int i = 0;i < ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		
		long[] result = productArray(ar);
		
		for(int i = 0;i < result.length;i++) {
			System.out.print(result + " ");
		}
	}

}
