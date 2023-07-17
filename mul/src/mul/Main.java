package mul;

import java.util.Scanner;

public class Main {

    public static void maxProductPair(int[] arr) {
        // write your code here
        int fl = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] > fl) {
                sl = fl;
                fl = arr[i];
            }
            else if(arr[i] > sl) {
                sl = arr[i];
            }
        }
        int fs = Integer.MAX_VALUE, ss = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] < fs) {
                ss = fs;
                fs = arr[i];
            }
            else if(arr[i] < ss) {
                ss = arr[i];
            }
        }
        int p1 = sl * fl;
        int p2 = ss * fs;
        System.out.println(p1 > p2 ? p1 : p2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < arr.length;i++) {
            arr[i] = scan.nextInt();
        }
       maxProductPair(arr);
    }
}