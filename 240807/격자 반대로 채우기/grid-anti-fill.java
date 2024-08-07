import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][] arr = new int [n][n];
        int cnt = 1;
        int cnt2 = 6;

        for(int col = n-1; col >=0; col-=2){
            int row = n-1;

            while(true){
                arr[row][col] = cnt;
                row--;
                cnt++;

                if(row<0){
                    cnt += n;
                    break;
                }
            }
        }

        for(int col = n-2; col >=0; col-=2){
            int row = 0;
            
            while(true){
                arr[row][col] = cnt2;
                row++;
                cnt2++;

                if(row==n){
                    cnt2 += n;
                    break;
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