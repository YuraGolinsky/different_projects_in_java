import java.util.Scanner;

public class Goods {

    Goods(){
        String name;
        long price;
        int left;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву товару: ");
        name = scanner.nextLine();
        System.out.print("Введіть ціну в центах (12,34 => 1234): ");
        price = scanner.nextLong();
        System.out.print("Скільки залишилось: ");
        left = scanner.nextInt();

        this.name = name;
        this.price = price;
        this.left = left;
    }
    private String name;
    private long price;
    int left;

    public void printName(){
        System.out.println("Ім'я: " + name);
    }
    public void printPrice(){
        System.out.println("Ціна (в центах): " + getPrice(true));
    }
    public void printLeft(){
        System.out.println("Ліворуч (шт.): " + left);
    }

    public void setPrice(int newPrice){
        price = newPrice;
    }
    public void setPrice(long newPrice){
        price = newPrice;
    }
    public void setPrice(float newPrice){
        price = Math.round(newPrice*100);
    }
    public void setPrice(double newPrice){
        price = Math.round(newPrice*100);
    }
    public long getPrice(){
        return price;
    }
    public double getPrice(boolean is_float){
        return price/100.0;
    }

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void setLeft(int newLeft){
        left = newLeft;
    }
    public int getLeft(){
        return left;
    }

    public String toString(){
        return String.format(
                "Goods: %d\nІм'я: %s\nЦіна: %1.2f\nLeft: %d\n",
                hashCode(),
                name,
                price/100.0,
                left
        );
    }
}
