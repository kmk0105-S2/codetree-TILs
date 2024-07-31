import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] val = new int [n];

        for(int i = 0; i<val.length; i++){
            val[i] = scanner.nextInt();

            if(val[i] % 2 == 0){
                System.out.printf("%d ", val[i]);
            }
        }

    }
}