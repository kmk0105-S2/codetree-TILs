import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> car = new ArrayList<>();

        for(int i = 0; i < n; i++){
            car.add(scanner.nextInt());
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i = 0; i < n; i++){
            if(car.get(i) < min){
                min = car.get(i);
                index = i;
            }
        }

        if(index != n){
            for(int j = index; j <n; j++){
                if(car.get(j) > max){
                    max = car.get(j);
                }
            }
            System.out.printf("%d", max-min);
        }
        else {
            max = min;
            System.out.printf("0");
        }



    }
}