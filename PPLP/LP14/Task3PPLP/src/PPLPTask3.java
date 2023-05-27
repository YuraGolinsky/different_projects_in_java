public class PPLPTask3 implements intTurn {
    public static void main(String[] args) {
        int p = 0;
        System.out.println("Раніше:");//масив початковий
        for (int i = 0; i < 16; i++) {
            a[i] = (int) (16 * Math.random());
            System.out.print(a[i] + "\t");
            if ((a[i] % 1 == 0)) {// Заміна нулями
                a[i] = 0;
                p++;
            }
        }
        System.out.println("\nПісля:");
        for (int i = 0; i < 16; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\nКількість замін: " + p);
    }
}