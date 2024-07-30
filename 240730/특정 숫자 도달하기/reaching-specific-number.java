import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int [] tntwk = new int[10];
        int sum = 0;
        int count = 0;
        double avg = 0;

        for(int i = 0; i<10; i++){
            int var = scanner.nextInt();
            if(var >=250){
                break;
            }
            else{
                sum += var;
                count++;
            }
        }

        avg = (double)sum / count;

        System.out.print("%d %.1f", sum, avg);
    }
}