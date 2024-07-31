import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] str = new int[10];

        for(int i = 0; i<str.length; i++){
            str[i] = scanner.nextInt();
        }

        for(int j = 0; j <str.length; j++){
            if(str[j] % 3 == 0){
                System.out.print(str[j-1]);
                break;
            }
        }
    }
}