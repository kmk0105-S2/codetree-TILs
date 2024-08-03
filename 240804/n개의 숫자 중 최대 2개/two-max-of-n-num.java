import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] val = new int [n];
        

        for(int i = 0; i < n; i++){
            val[i] = scanner.nextInt();
        }

        for(int j = 0; j < n - 1; j++){
            for(int k = 0; k < n - 1 - j; k++){
                
                if(val[k] < val[k+1]){
                    int temp = val[k];
                    val[k] = val[k+1];
                    val[k+1] = temp;
                }
            }
        }

        System.out.printf("%d %d", val[0], val[1]);
    }
}