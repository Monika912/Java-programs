package sum1;

import java.util.Scanner;

public class sumMaxMin {
	static int sum(int[] ar) {
        int res = 0;
        for(int i = 0;i < ar.length;i++) {
            res+=ar[i];
        }
		return res;
    }
	
	static int max(int[] ar) {
        int max = ar[0];
        for(int i = 0;i < ar.length;i++) {
            if(ar[i] > max) {
                max = ar[i];
            }
        }
		return max;
    }
	
	static int min(int[] ar) {
        int min = ar[0];
        for(int i = 0;i < ar.length;i++) {
            if(ar[i] < min) {
                min = ar[i];
            }
        }
		return min;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] ar = new int[N];

        for(int i = 0;i < ar.length;i++) {
            ar[i] = sc.nextInt();
        }
        int sum = sum(ar);
        int max = max(ar);
        int min = min(ar);
        
		System.out.println(sum - max);
		System.out.println(sum - min);
        
        
    }

}

