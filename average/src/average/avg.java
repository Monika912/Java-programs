package average;

import java.util.Scanner;
public class avg {
	static void avgArray(int[] ar) {
		float sum = 0.0f, res = 0.0f;
	    for(int i = 0; i < ar.length;i++) {
	    	sum = sum + ar[i];
	        }
	        res = sum / ar.length;
	        System.out.printf("%.2f",res);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        
	        int[] ar = new int[N];
	        // implement your logic here
	        for(int i = 0; i < ar.length;i++) {
	            ar[i] = sc.nextInt();
	        }
	        avgArray(ar);
	    }
	}