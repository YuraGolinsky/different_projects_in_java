
import java.util.Arrays;
        import java.util.Collections;

public class PPLPTask1 implements intTurn {
    public static void main(String[] args) {
        Arrays.sort(arr, Collections.reverseOrder());
        for (int values : arr) {
            System.out.print(values + ", ");
            // 100,80,50,20,15
        }
    }
}