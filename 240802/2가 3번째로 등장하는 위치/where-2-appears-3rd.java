import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] array = new int [n];
        int cnt = 0;
        int index = 0;

        for(int k = 0; k<n; k++){
            array[k] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(array[i] == 2){
                cnt++;
            }

            if(cnt == 3){
                index = i;
                break;
            }

        }
        System.out.printf("%d", index+1);
    }
}