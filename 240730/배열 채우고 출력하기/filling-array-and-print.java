import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        char [] ch = new char[10]; 

        for(int i = 0; i<10; i++){
            ch[i] = scanner.next().charAt(0);
        }

        for(int i = 9; i>=0; i--){
            System.out.print(ch[i]+" ");
        }

    }
}