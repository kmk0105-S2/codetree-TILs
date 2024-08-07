import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][] arr = new int [n][n];

        for(int i = 0; i < n; i++){
            arr[i][0] = 1;

            if(i == 0){
                for(int j = 0; j < n; j++){
                    arr[i][j] = 1;
                }
            }else{
                for(int j = 1; j < n; j++){
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1]+arr[i][j-1];
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}