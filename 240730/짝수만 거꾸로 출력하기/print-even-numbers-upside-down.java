import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int [] val = new int [cnt];

        for(int i = 0; i<cnt; i++){
            val[i] = scanner.nextInt();
        }

        for(int i = cnt-1; i>=0; i--){
            if(val[i]%2 == 0){
                System.out.printf("%d ", val[i]);
            }
        }
    }
}