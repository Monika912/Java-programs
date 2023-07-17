import java.util.Scanner;

public class merge {

    static void arrayMerger(int[] arr1, int[] arr2) {
        int c = arr1.length + arr2.length;

        int[] d = new int[c];

        for(int i = 0;i < arr1.length;i++) {
            d[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length;i++) {
            d[arr1.length + i] = arr2[i];
        }
        for(int i = 0; i < c - 1;i++) {
            System.out.print(d[i] + " ");
        }
        
        System.out.print(arr2[arr2.length-1]);
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar1 = new int[n];

        for(int i = 0; i < ar1.length;i++) {
            ar1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] ar2 = new int[m];

        for(int j = 0; j < ar1.length;j++) {
            ar2[j] = sc.nextInt();
        }

        arrayMerger(ar1,ar2);




    }
}