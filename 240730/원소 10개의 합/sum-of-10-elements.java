import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<10; i++){
            int var = scanner.nextInt();
            sum += var;
        }
        System.out.print(sum);
    }
}