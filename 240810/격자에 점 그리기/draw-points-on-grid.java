import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][] arr = new int [n][n];
        int cnt = 0;

        for(int i = 0; i < m; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            cnt++;
            arr[x-1][y-1] = cnt;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j]!= 0){
                    System.out.printf("%d ", arr[i][j]);
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}