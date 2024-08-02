import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] word = new char []{'L', 'E', 'B','R','O','S'};
        int cnt = 0;
        int result = 0;
        char asdf = scanner.next().charAt(0);

        for(int i = 0; i<6; i++){
            if(word[i] == asdf){
                cnt++;
                result = i;
            }   
        }

        if(cnt == 1){
            System.out.print(result);
        }
        else{
            System.out.print("None");
        }
    }
}