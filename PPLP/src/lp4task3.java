
import java.util.Arrays;
//рядки масиву сортуються за збільшенням;
public class lp4task3 {

        public static void main(String[] args) {
            int[] arr = { 5, 2, 1, 11, 10 };
            Arrays.sort(arr);

            for (int values : arr) {
                System.out.print(values + "");
                // 1, 2, 5,  10,11
            }
        }
    }



