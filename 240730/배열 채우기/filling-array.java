import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] val = new int [10];
        int count = 0;

        for(int i = 0; i<10; i++){
            val[i] = scanner.nextInt();
            count++;

            if(val[i] == 0){
                count--;
                break;
            }
        }

        for(int i = count-1; i>= 0; i--){
            System.out.printf("%d ", val[i]);
        }


    }
}