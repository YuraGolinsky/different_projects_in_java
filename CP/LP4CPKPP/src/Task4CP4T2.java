

import java.util.Arrays;

public class Task4CP4T2 {
    public static void main(String[] args) {
      //  String[] values = {"B", "V", "C", "D", "E"};
       String[] values = {"B", "A", "C", "D", "E"};
        String target = "A";
        boolean found = Arrays.asList(values).contains(target);
        System.out.println(found);        // true
    }
}
