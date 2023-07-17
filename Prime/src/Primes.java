import java.util.Scanner;
public class Primes {
	
	static boolean isPrime(int n) {
		int count = 0;
		for(int i = 2;i<=n/2;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static void printPrime(int n,int m) {
		for(int i = n;i <= m;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		printPrime(n,m);
	}

}
