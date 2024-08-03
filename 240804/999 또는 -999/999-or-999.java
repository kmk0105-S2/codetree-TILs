import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] val = new int [100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for(int i = 0; i < 100; i++){
            val[i] = scanner.nextInt();

            if(val[i] == 999 || val[i] == -999){
                val[i] = val[i-1];
                cnt = i;
                break;
            }
        }

        for(int j = 0; j < cnt; j++){
            if(val[j] > max){
                max = val[j];
            }

            if(min > val[j]){
                min = val[j];
            }
        }

        System.out.printf("%d %d", max, min);
    }
}