
import java.util.Scanner;

public class Tim_phan_tu_lon_nhat_trong_mang_2_chieu {
    public static void main(String[] args) {
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element " + (i + 1) + " " + (j + 1) + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");

            }
        }
        int max = arr[0][0];
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexI = i + 1;
                    indexJ = j + 1;
                }

            }
        }
        System.out.println();
        System.out.println("At " + indexI + " " + indexJ + ": Max = " + max);
    }
}
