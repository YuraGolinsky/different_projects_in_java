import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону А параллелограмма : ");//a сторона
        double A = scanner.nextDouble();

        System.out.println("Введите высоту параллелограмма : ");//h высота
        double height = scanner.nextDouble();

        //Площадь параллелограмма вычисляется по формуле = S = A * H
        double area = (A*height);
        System.out.println("Площадь параллелограмма равна: " + area);
    }
}