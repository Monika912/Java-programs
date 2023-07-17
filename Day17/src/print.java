 import java.util.Scanner;

public class print {
	
	static void printRepeatedElements(int[] arr) {
		boolean isDuplicated = false;
        int count = 1;
        for(int i = 0;i < arr.length-1;i++) {
            if(arr[i] == arr[i+1] ){
                isDuplicated = true;
                count++;
            }
            else if(count > 1) {
            	System.out.print(arr[i]+" ");
            	count = 1;
            }
        }
        if(count > 1) {
            System.out.print(arr[arr.length-1]);
        }
        if(isDuplicated == false) {
            System.out.print(-1);
        }
	}
	
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printRepeatedElements(ar);

     }
}
