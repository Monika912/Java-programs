package evenReplace;

import java.util.Scanner;
public class withZero {
	static int[] replace(int[] ar) {
		for(int i = 0;i < ar.length;i++) {
			if(ar[i] % 2 == 0) {
				ar[i] = 0;
            }
		}
		for(int i = 0;i < ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
		return ar;
     }
            
     public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] ar = new int[N];
           
        for(int i = 0;i < ar.length;i++) {
        	ar[i] = sc.nextInt();
        }
        replace(ar);
     }
}

    
    