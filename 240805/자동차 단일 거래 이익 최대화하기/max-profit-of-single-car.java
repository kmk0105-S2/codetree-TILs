import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] car = new int [n];

        for(int i = 0; i < n; i++){
            car[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i = 0; i < n; i++){
            if(car[i] < min){
                min = car[i];
                index = i;
            }
        }

        if(index != n){
            for(int j = index; j <n; j++){
                if(car[j] > max){
                    max = car[j];
                }
            }
            System.out.printf("%d", max-min);
        }
        else {
            System.out.printf("0");
        }



    }
}