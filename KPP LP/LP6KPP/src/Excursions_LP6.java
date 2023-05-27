import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
class Excursions_LP6 {
    private String Country;

    private String City;
    private String Name;
    private String Transport;

    private double Trivality_of_excursions;
    private double Price;


    public   Excursions_LP6(String Country, String City, String Name ,String Transport, double Trivality_of_excursions,double Price) {
        this.Country = Country;
        this.City = City;
        this.Name = Name;
        this.Trivality_of_excursions = Trivality_of_excursions;
        this.Transport = Transport;
        this.Price = Price;

    }

    public Excursions_LP6() {

    }

    void print(){
        System.out.println(" Країна: " + Country +" Місто: " + City +" Назва екскурсій: " + Name +" Тривалість екскурсій (в годинах): "
                + Trivality_of_excursions +" Транспорт для екскурсій: " + Transport + " Ціна у гривнях: " + Price);
    }
    public void writeData(PrintWriter out)
            throws IOException
    {
        out.println(Country+"|"+City+"|"+Name+"|"+Transport+"|"+Trivality_of_excursions+"|"+Price);
    }
    public void readData(BufferedReader in)
            throws IOException
    {
        String s=in.readLine();
        StringTokenizer t=new StringTokenizer(s,"|");
        Country=t.nextToken();
        City=t.nextToken();
        Name=t.nextToken();
        Transport=t.nextToken();
        Trivality_of_excursions=Double.parseDouble(t.nextToken());
        Price=Double.parseDouble(t.nextToken());
    }
}
