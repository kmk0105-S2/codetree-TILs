import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] str = new int [100];

        for(int i = 0; i<str.length; i++){
            str[i] = scanner.nextInt();

            if(str[i]==0){
                break;
            }

            if(str[i] % 2 == 0){
                System.out.printf("%d ", str[i]/2);
            }
            else{
                System.out.printf("%d ", str[i]+3);
            }
        }
    }
}