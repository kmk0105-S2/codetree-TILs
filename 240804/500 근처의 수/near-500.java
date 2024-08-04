import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] val = new int [10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 10; i++){
            val[i] = scanner.nextInt();
        }

        for(int j = 0; j < 10; j++){
            if(val[j] > 500){
                if(val[j] - 500 < min){
                    min = val[j] - 500;
                }
            }
            if(val[j] < 500){
                if(val[j] - 500 > max){
                    max = val[j] - 500;
                }
            }
        }

        System.out.printf("%d %d", 500+max, min+500);
    }
}