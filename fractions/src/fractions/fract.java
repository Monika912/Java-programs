package fractions;

import java.util.Scanner;

public class fract {
	static void Fact(int n,int m)
	{
		int a,b,i;
		for(i = n;i>0;i--) {
			if(n%i == 0 && m%i == 0) {
				break;
			}
		}
		a = n/i;
		b = m/i;
		System.out.print(a + "/" + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Fact(n,m);

	}

}
