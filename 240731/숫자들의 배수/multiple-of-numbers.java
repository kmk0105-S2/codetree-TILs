import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] val = new int [15];
        int cnt = 0;

        for(int i = 1; i<=15; i++){
            val[i] = n*i;
            System.out.printf("%d ", val[i]);

            if(val[i]%5 == 0){
                cnt++;
            }

            if(cnt == 2){
                break;
            }
        }
    }
}