import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int [] str = new int [100];
        str[0] = 1;
        str[1] = a;

        System.out.printf("%d %d ", str[0], str[1]);

        for(int i = 2; i<100; i++){
            str[i] = str[i-1]+ str[i-2];

            if(str[i]>100){
                System.out.printf("%d ", str[i]);
                break;
            }
            else{
                System.out.printf("%d ", str[i]);
            }
        }
        

    }
}