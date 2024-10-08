import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][] arr = new int[n][n];

        for(int i = 0; i < m; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr[x-1][y-1] = x*y;
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}