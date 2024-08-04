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

        if (index != -1) {
            for (int j = index+1; j < n; j++) {
                if (car[j] > max) {
                    max = car[j];
                }
            }
            
            if (max != Integer.MIN_VALUE) {
                System.out.printf("%d", max - min);
            } else {
                System.out.printf("0");
            }
        }
        else {
            System.out.printf("0");
        }

    }
}