import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][] arr = new int[n][n];
        int cnt = 1;

        for (int col = n - 1; col >= 0; col--) {
            if ((n - col) % 2 == 1) {
                // 아래에서 위로 채우기
                for (int row = n - 1; row >= 0; row--) {
                    arr[row][col] = cnt++;
                }
            } else {
                // 위에서 아래로 채우기
                for (int row = 0; row < n; row++) {
                    arr[row][col] = cnt++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}