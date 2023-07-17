import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        String s = s.to

        System.out.println("Enter the 2D array:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("Maximum hourglass sum: " + maxSum);
    }

    public static int calculateHourglassSum(int[][] arr, int row, int col) {
        int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2]
                + arr[row + 1][col + 1]
                + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
        return sum;
    }
}
