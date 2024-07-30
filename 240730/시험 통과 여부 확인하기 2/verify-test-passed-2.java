import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        double [] grd = new double [cnt];
        int [] score = new int [4];
        int pp = 0;

        for(int i = 0; i<cnt; i++){
            int sum = 0;
            for(int j = 0; j<4; j++){
                score[j] = scanner.nextInt();
                sum += score[j];
            }
            grd[i] = (double)sum/4;
        }

        for(int i = 0; i<cnt; i++){
            if(grd[i] >= 60){
                System.out.println("pass");
                pp++;
            }
            else{
                System.out.println("fail");
            }
        }

        System.out.println(pp);


    }
}