import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int [] val = new int [n];
        int [] newVal = new int [n-1];

        for(int i = 0; i < n; i++){
            val[i] = scanner.nextInt();
        }

        for(int j = 0; j < n-1; j++){
            newVal[j] = val[j+1] - val[j];
        }

        for(int k = 0; k < n-1; k++){
            if(newVal[k] < min){
                min = newVal[k];
            }else{
                continue;
            }
        }

        System.out.printf("%d", min);
    }
}