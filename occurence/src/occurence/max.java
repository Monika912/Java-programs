package occurence;

import java.util.Scanner;
public class max {
    static void max(int[] ar) {
        int max = ar[0], count = 0;
        for(int i = 1;i < ar.length;i++) {
            if(ar[i] > max) {
                count = count+1;
            }
        }
        System.out.print(count);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] ar = new int[N];

        for(int i = 0;i < ar.length;i++) {
            ar[i] = sc.nextInt();
        }
        max(ar);
    }
}