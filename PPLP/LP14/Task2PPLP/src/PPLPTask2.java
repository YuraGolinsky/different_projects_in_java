public class PPLPTask2 implements intTurn {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < N; ++i) {
            array[i] = random.nextInt(100) - 20;
            System.out.print(array[i] + " ");
            if (array[i] < 0) sum += array[i];

        }
        System.out.println();
            System.out.println("Сума негативних: " + sum);

        }
    }
