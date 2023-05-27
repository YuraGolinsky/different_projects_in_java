import java.util.Arrays;

//перевіряється правильність прийому масиву
public class LP4Task2 {
        public static void main(String[] args) {
            //  String[] values = {"B", "V", "C", "D", "E"};
            String[] values = {"B", "A", "C", "D", "E"};
            String target = "A";
            boolean found = Arrays.asList(values).contains(target);
            System.out.println(found);        // true / false
        }
    }


