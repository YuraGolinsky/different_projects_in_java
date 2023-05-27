
import java.util.Scanner;
//з клавіатури вводиться двовимірний масив дійсних чисел розміром n*n;
    public class LP4Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 2;
        int m = 2;
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Введіть число для " + i + " масиву: " + j + " : ");
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("======= matrix =======");
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + "\t");
            }
            System.out.println();
        }
    }
}
