import java.util.Scanner;

public class mirroredVPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        printMirroredVerticalVPattern(rows);
    }

    public static void printMirroredVerticalVPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = numRows; k >= i; k--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
