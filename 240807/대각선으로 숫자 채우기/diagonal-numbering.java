import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int [n][m];
        int count = 1;

        for(int startCol = 0; startCol < m; startCol++){
            int currRow = 0;
            int currCol = startCol;

            while(currCol >= 0 && currRow < n){
                arr[currRow][currCol] = count;

                currRow++;
                currCol--;
                count++;
            }
        }

        for(int startRow = 1; startRow < n; startRow++) {
            int currRow = startRow;
            int currCol = m - 1;

            while(currCol >= 0 && currRow < n) {
                arr[currRow][currCol] = count;

                currRow++;
                currCol--;
                count++;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        // 00 01 02 03
        // 10 11 12 13
        // 20 21 22 23
        // 30 31 32 33
    }
}