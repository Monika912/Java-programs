package chess;

import java.util.Scanner;

public class VerticalVPattern {
    public static void main(String[] args) {
    	SL = Integer.MIN_VALUE
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        printVerticalVPattern(rows);
    }

    public static void printVerticalVPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = numRows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
