package max;

import java.util.Scanner;

public class Pairsum {
	 public static int findMaxSum(int[] arr) {
	        // Write your code here
	        int max = arr[0], fl = Integer.MIN_VALUE, sl = Integer.MIN_VALUE, sum=0;
	        for(int i = 0;i < arr.length;i++) {
	            if(arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        for(int i = 0;i < arr.length;i++) {
	            if(arr[i] > fl) {
	                sl = fl;
	                fl = arr[i];
	            }
	            else {
	            	if(arr[i] > sl && arr[i]!=fl) {
		                sl = arr[i];
	                }
	            }
	        }
	        for(int i = 0;i < arr.length;i++) {
	        	sum = max + sl;
	        }
	        return sum;
	 }
	 
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         
         int[] arr = new int[n];
         
         for(int i = 0;i < arr.length;i++) {
         	arr[i] = scan.nextInt();
         }
         int res = findMaxSum(arr);
         System.out.println(res);
     }
}	        
	 
	 

