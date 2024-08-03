import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] val = new int [n];
        int max = 0;

        for(int i = 0; i < n; i++){
            val[i] = scanner.nextInt();
        }

        for(int j = 0; j < n; j++){
            for(int k = j + 1; k < n; k++){
                if(val[j] == val[k]){
                    val[j] = 0;
                    val[k] = 0;
                }
            }
        }

        for(int a = 0; a < n; a++){
            if(val[a] > max){
                max = val[a];
            }
        }

        if(max != 0){System.out.printf("%d", max); }
        else{
            System.out.printf("-1");
        }
    }
}