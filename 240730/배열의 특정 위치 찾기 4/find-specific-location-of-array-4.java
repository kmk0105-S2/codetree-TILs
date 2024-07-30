import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] val = new int[10];
        int count = 0;
        int sum = 0;

        for(int i = 0; i<10; i++){
            val[i] = scanner.nextInt();

            if(val[i]%2 == 0 && val[i] != 0){
                count++;
                sum += val[i];
            }
            if(val[i] == 0){
                break;
            }
            
        }

        System.out.printf("%d %d", count, sum);
    }
}