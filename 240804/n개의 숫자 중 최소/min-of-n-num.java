import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] val = new int [n];

        for(int i = 0; i< n; i++){
            val[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for(int j = 0; j < n; j++){
            if(min > val[j]){
                min = val[j];
            }
        }

        for(int k = 0; k < n; k++){
            if(min == val[k]){
                cnt++;
            }
        }

        System.out.printf("%d %d", min, cnt);

        
    }
}