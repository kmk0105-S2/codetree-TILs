import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int cnt = 0;
        int [] var = new int [n];

        for(int i = 0; i<n; i++){
            var[i] = scanner.nextInt();
            if(var[i] == m){
                cnt++;
            }
        }

        System.out.printf("%d", cnt);

    }
}