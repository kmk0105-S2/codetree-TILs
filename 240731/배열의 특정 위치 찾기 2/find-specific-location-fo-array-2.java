import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] tn = new int [10];
        int sum = 0;
        int sum2 = 0;

        for(int i = 0; i < tn.length; i++){
            tn[i] = scanner.nextInt();
        }
        
        for(int j = 0; j<tn.length; j++){
            if(j%2 == 0){
                sum2 += tn[j];
            }
            else{
                sum += tn[j];
            }
        }

        if(sum2 >= sum){
            System.out.print(sum2-sum);
        }
        else{
            System.out.print(sum - sum2);
        }
    }
}