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

        boolean match = false;

        for (int k = 0; k <= n1 - n2; k++) {
            boolean match = true;

            for (int i = 0; i < n2; i++) {
                if (A[k + i] != B[i]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}