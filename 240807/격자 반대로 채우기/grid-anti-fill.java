import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][] arr = new int [n][n];
        int cnt = 1;

        for(int col = n-1; col >=0; col--){
            
            if(col % 2 == 1){
                int row = n-1;

                while(row >= 0){
                    arr[row][col] = cnt;
                    cnt++;
                    row--;
                }
            }
            if(col%2 == 0){
                int row = 0;

                while(row <= n-1){
                    arr[row][col] = cnt;
                    cnt++;
                    row++;
                }
            }

        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}