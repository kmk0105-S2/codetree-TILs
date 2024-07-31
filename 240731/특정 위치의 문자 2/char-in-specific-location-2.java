import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char [] str = new char [10];

        for(int i = 0; i<10; i++){
            str[i] = scanner.next().charAt(0);
        }

        System.out.printf("%c %c %c", str[1], str[4], str[7]);
    }
}