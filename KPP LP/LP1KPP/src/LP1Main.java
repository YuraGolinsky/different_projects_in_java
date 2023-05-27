import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LP1Main {
        public static void main(String[] args) throws IOException {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            Scanner scanner= new Scanner(System.in);
            System.out.println("Введіть кількість екскурсій:");
            int count = Integer.parseInt(r.readLine());
            Excursions_LP1 arr[]= new Excursions_LP1[count];
            for(int i=0;i < count; i++){

                System.out.println("Введіть  країну для екскурсій:");
                String Country = scanner.nextLine();

                System.out.println("Введіть  місто для екскурсій:");
                String City = scanner.nextLine();

                System.out.println("Введіть назву екскурсій:");
                String Name = scanner.nextLine();

                System.out.println("Введіть вартість екскурсій :");
                double Price = Double.parseDouble(scanner.nextLine());

                System.out.println("Введіть тривалість екскурсій:");
                double Trivality_of_excursions = Double.parseDouble(scanner.nextLine());

                System.out.println("Введіть транспорт для екскурсій:"); //
                String Transport = scanner.nextLine();

                arr[i]= new Excursions_LP1(Country,City,Name,Trivality_of_excursions,Transport,Price);
                arr[i].print();
            }


        }
    // Клонирование

    public static Excursions_LP1 arr(Excursions_LP1 obj2) {
        Excursions_LP1 obj = null;
        try {
            obj = (Excursions_LP1) obj2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }
}


