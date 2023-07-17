package arrays;

import java.util.Scanner;

public class merged {
	public static int[] mergedArray(int[] arr1, int[] arr2){
		
		int[] res = new int[arr1.length + arr2.length];
		int i=0, j=0, k=0;
		if(i < arr1.length) {
			res[k++] = arr1[i++];
		}
		else {
			res[k++] = arr2[j++];
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();

		int[] ar = new int[n];
		int[] ar1 = new int[m];
		

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = scan.nextInt();
		}
		int[] result = mergedArray(ar,ar1);
		System.out.println(result + " ");

	}

}
