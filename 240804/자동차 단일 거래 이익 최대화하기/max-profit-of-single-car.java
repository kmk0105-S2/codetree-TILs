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
        int index = -1;

        for(int i = 0; i < car.size(); i++){
            if(car.get(i) < min){
                min = car.get(i);
                index = i;
            }
        }

        int max = Integer.MIN_VALUE;

        for(int j = index + 1; j <car.size(); j++){
            if(car.get(j) > max){
                max = car.get(j);
            }
        }

        if(max - min > 0){
            System.out.printf("%d", max-min);
        }
        else{
            System.out.printf("0");
        }



    }
}