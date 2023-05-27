import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class GoodsOfSale extends Goods{

    GoodsOfSale(){
        super();
        long secondary;
        int warranty;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Яка роздрібна ціна (у центах): ");
        secondary = scanner.nextLong();
        System.out.print("Тепер введіть виробничі дані:\n");
        LocalDate date = getDate(scanner);
        System.out.print("Введіть термін гарантії (в днях): ");
        warranty = scanner.nextInt();

        this.secondaryPrice = secondary;
        this.produced = date;
        this.warranty = warranty;
    }

    private static LocalDate getDate(Scanner scanner){
        System.out.print("Введіть дату (наприклад, 10): ");
        int day = scanner.nextInt();
        System.out.print("Введіть місяць (наприклад, 12): ");
        int month = scanner.nextInt();
        System.out.print("Введіть рік (наприклад, 1999): ");
        int year = scanner.nextInt();
        try {
            return LocalDate.of(year, month, day);
        }
        catch (DateTimeException E){
            System.out.print("Неправильний формат дня/місяця/ріку:(\nTry again:\n");
            return getDate(scanner);
        }
    }
    long secondaryPrice;
    LocalDate produced;
    int warranty; //days

    public void printSecondaryPrice(){
        System.out.println("Роздрібна ціна (в центах): " + getPrice());
    }
    public void printProduced(){
        System.out.println("Вироблено на: " + produced);
    }
    public void printWarranty(){
        System.out.printf("Гарантія на %d днів\n", warranty);
    }

    public void setSecondaryPrice(int newSP){
        secondaryPrice = newSP;
    }
    public void setSecondaryPrice(long newSP){
        secondaryPrice = newSP;
    }
    public void setSecondaryPrice(float newSP){
        secondaryPrice = Math.round(newSP*100);
    }
    public void setSecondaryPrice(double newSP){
        secondaryPrice = Math.round(newSP*100);
    }

    public long getSecondaryPrice(){
        return secondaryPrice;
    }
    public double getSecondaryPrice(boolean is_float){
        return secondaryPrice/100.0;
    }

    public int getWarranty(){
        return warranty;
    }
    public void setWarranty(int days){
        warranty = days;
    }

    public double getProfit(){
        return left*(getSecondaryPrice(true) - getPrice(true));
    }

    @Override
    public void printPrice(){
        System.out.printf(
                "Base: %1.2f UAH\nRetail: %1.2f UAH\n",
                getPrice(true),
                getSecondaryPrice(true)
        );
    }

    @Override
    public String toString(){
        return super.toString() + String.format(
                "Роздрібна ціна: %1.2f\nВироблено на: %s\nГарантія на: %d днів",
                getSecondaryPrice(true),
                produced,
                warranty
        );
    }

}
