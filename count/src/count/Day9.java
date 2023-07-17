package count;

import java.util.Scanner;

public class Day9 {
	    static int[] rearrange(int[] ar) {
	        for(int i = 0;i < ar.length;i++) {
	            if(ar[i] < 0) {
	                System.out.print(ar[i]+ " ");
	            }
	        }
	        for(int i = 0;i < ar.length;i++) {
	            if(ar[i] >= 0) {
	                System.out.print(ar[i]+ " ");
	            }
	        }
	        return ar;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int[] ar = new int[n];

	        for(int i = 0;i < ar.length;i++) {
	            ar[i] = sc.nextInt();
	        }
	        int[] res = rearrange(ar);
	        System.out.println(res);
	    }
	}