import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] grd = new double [8];
        double sum = 0;

        for(int i = 0; i<8; i++){
            grd[i] = scanner.nextDouble();
            sum += grd[i];
        }

        System.out.printf("%.1f", sum / 8);

    }
}