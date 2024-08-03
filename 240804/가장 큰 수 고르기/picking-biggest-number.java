import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] val = new int [10];

        for(int i = 0; i<10; i++){
            val[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int j = 0; j<10; j++){
            if(val[j] > max){
                max = val[j];
            }
        }

        System.out.printf("%d", max);
    }
}