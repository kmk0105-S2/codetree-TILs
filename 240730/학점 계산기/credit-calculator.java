import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        double [] grd = new double [count];

        for(int i = 0; i<count i++){
            grd[i] = scanner.nextDouble();
            double sum += grd[i];
        }

        double avg = sum / count;

        System.out.print("%.lf\n", avg);

        if(avg >= 4.0){
            System.out.println("Perfect");
        }
        else if(avg >= 3.0){
            System.out.println("Good");
        }
        else{
            System.out.println("Poor");
        }

    }
}