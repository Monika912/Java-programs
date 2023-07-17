import java.util.Scanner;

public class posNegativeSum {
	    static void sum(int[] ar) {
	        int pos = 0,neg = 0;
	        for(int i = 0;i < ar.length;i++) {
	            if(ar[i] > 0) {
	                pos+=ar[i];
	            }
	            else {
	            	neg+=ar[i];
	            }
	        }
	        System.out.println(pos);
	        System.out.print(neg);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // implement your logic here
        int[] ar = new int[n];

        for(int i = 0;i < ar.length;i++) {
            ar[i] = sc.nextInt();
        }
        sum(ar);
	}

}
