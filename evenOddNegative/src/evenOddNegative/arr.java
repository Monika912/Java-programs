package evenOddNegative;

import java.util.Scanner;
public class arr {
    static void negative(int[] ar) {
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] < 0) {
				System.out.print(ar[i] + " ");
			}
		}
		System.out.println();
	}

    static void odd(int[] ar) {
        for(int i = 0; i < ar.length; i++) {
            if(ar[i]%2 != 0 && ar[i] > 0) {
                System.out.print(ar[i] + " ");
            }
        }
        System.out.println();
    }

    static void even(int[] ar) {
        for(int i = 0; i < ar.length; i++) {
            if(ar[i]%2 == 0 && ar[i] > 0) {
                System.out.print(ar[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] ar = new int[N];
		
		for(int i = 0;i < ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		negative(ar);
        odd(ar);
        even(ar);
	}
}
   
    
    
    
    
    
    
    
    
    
    
