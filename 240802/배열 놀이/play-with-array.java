import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int [] var = new int [n];

        

        for(int i = 0; i<n; i++){
            var[i] =scanner.nextInt();
        }

        for(int i = 0; i<q; i++){
            int num = 0;
            int result = 0;

            int index = scanner.nextInt();

            if(index == 1){
                num = scanner.nextInt();
                System.out.println(var[num-1]);
            }

            else if(index == 2){
                num = scanner.nextInt();

                for(int j = 0; j<n; j++){
                    if(var[j] == num){
                        result = j+1;
                        break;
                    }
                    else{
                        result = 0;
                    }
                }

                System.out.println(result);

            }

            else if (index == 3) {
                int s = scanner.nextInt();
                int e = scanner.nextInt();

                for(int k = s; k<= e; k++){
                    System.out.printf("%d ", var[k-1]);
                }
                System.out.println();
            }
        }

    }
}