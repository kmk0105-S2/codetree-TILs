import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int [] A = new int [n1];
        int [] B = new int [n2];

        for(int i = 0; i < n1; i++){
            A[i] = scanner.nextInt();
        }

        for(int j = 0; j < n2; j++){
            B[j] = scanner.nextInt();
        }

        for(int k = 0; k < n1; k++){
            if(B[0] == A[k]){
                for(int i = 1; i<n2; i++){
                    if(B[i] != A[k+i]){
                        System.out.print("No");
                        break;
                    }
                    else{
                        System.out.print("Yes");
                        break;
                    }
                }
            }
        }

    }
}