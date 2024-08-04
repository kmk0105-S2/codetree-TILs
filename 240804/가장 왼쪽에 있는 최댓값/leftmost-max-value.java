import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] val = new int [n];

        for(int i = 0; i < n; i++){
            val[i] = scanner.nextInt();
        }

        int max = 0;
        int cnt = 0;

        for(int j = 0; j < n; j++){
            if(val[j] > max){
                max = val[j];
                cnt = j+1;
            }
        }

        System.out.printf("%d ", cnt);

        int max2 = 0;
        int cnt2 = 0;
        
        while(true){
            for(int k = 0; k < cnt-1; k++){
                if(val[k] > max2){
                    max2 = val[k];
                    cnt2 = k+1;
                }
            }

            if(cnt2 != 1){
                System.out.printf("%d ", cnt2);
                cnt = cnt2;
                max2 = 0;
            }
            else{
                System.out.printf("%d", cnt2);
                break;
            }
        }
    }
}