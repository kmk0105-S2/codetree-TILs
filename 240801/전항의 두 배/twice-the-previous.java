import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] val = new int[10];

        val[0] = scanner.nextInt();
        val[1] = scanner.nextInt();

        System.out.printf("%d %d ", val[0], val[1]);

        for(int i = 2; i <10; i++){
            val[i] = val[i-1] + 2*val[i-2];
            
            System.out.printf("%d ", val[i]);
        }
    }
}