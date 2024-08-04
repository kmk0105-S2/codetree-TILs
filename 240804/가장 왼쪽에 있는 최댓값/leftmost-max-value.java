import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> val = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            val.add(scanner.nextInt());
        }

        while (!val.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int index = -1;

            for (int i = 0; i < val.size(); i++) {
                if (val.get(i) > max) {
                    max = val.get(i);
                    index = i;
                }
            }

            System.out.printf("%d ", index + 1);
            val = val.subList(0, index);
        }
    }
}