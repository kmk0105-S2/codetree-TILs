public class Main {
    public static void main(String[] args) {
        int [][] arr = new int [5][5];
        

        for(int col =0; col < 5; col++){
            int i = 0;
            arr[i][col] = 1;
        }

        for(int row = 1; row < 5; row++){
            for(int col = 1; col < 5; col++){
                arr[row][0] = 1;
                arr[row][col] = arr[row-1][col] + arr[row][col-1];
            }
        }

        for(int k = 0; k < 5; k++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%d ", arr[k][j]);
            }
            System.out.println();
        }


    }
}