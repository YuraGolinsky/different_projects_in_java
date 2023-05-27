import java.io.*;
import java.util.Scanner;

public class Excursions_LP6Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = 3;
        String[] Country = new String[n];
        String[] City = new String[n];
        String[] Name = new String[n];
        String[] Transport = new String[n];

        double[] Trivality_of_excursions = new double[n];
        double[] Price = new double[n];

        Excursions_LP6 m1[] = new Excursions_LP6 [n];
        System.out.println("Заполните массив: ");

//String
        System.out.println("Введите країну , пожалуйста: ");
        for (int i = 0; i < n; i++) {
            Country[i] = s.nextLine();
        }
        System.out.println("Введите місто , пожалуйста: ");
        for (int i = 0; i < n; i++) {
            City[i] = s.nextLine();
        }

        System.out.println("Введите назвy екскурсій, пожалуйста: ");
        for (int i = 0; i < n; i++) {
            Name[i] = s.nextLine();
        }
        System.out.println("Введите транспорт для екскурсій, пожалуйста: ");
        for (int i = 0; i < n; i++) {
            Transport[i] = s.nextLine();
        }

//Double

        System.out.println("Введите  тривалість екскурсій , пожалуйста: ");
        for (int i = 0; i < n; i++) {
            Trivality_of_excursions[i] = s.nextDouble();
        }
        System.out.println("Введите ціну у гривнях, пожалуйста : ");
        for (int i = 0; i < n; i++) {
            Price[i] = s.nextDouble();
        }


        m1[0] = new Excursions_LP6(Country[0], City[0],Name[0],Transport[0],Trivality_of_excursions[0],Price[0]);
        m1[1] = new Excursions_LP6(Country[1], City[1],Name[1],Transport[1],Trivality_of_excursions[1],Price[1]);
        m1[2] = new Excursions_LP6(Country[2], City[2],Name[2],Transport[2],Trivality_of_excursions[2],Price[2]);


        try
        {
            PrintWriter out=new PrintWriter(new FileWriter("D:\\Excursions_LP60310.txt"));
            writeData(m1,out);
            out.close();
            BufferedReader in=new BufferedReader(new FileReader("D:\\Excursions_LP60310.txt"));
            Excursions_LP6 m2[]=readData(in);
            in.close();
            for(int i=0;i<m2.length;i++)
            {
                m2[i].print();//System.out.println(m2[i]);
            }
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

    static void writeData(Excursions_LP6 g[],PrintWriter out)
            throws IOException
    {
        out.println(g.length);
        for(int i=0;i<g.length;i++)
            g[i].writeData(out);
    }
    static Excursions_LP6 [] readData(BufferedReader in)
            throws IOException
    {
        int n=Integer.parseInt(in.readLine());
        Excursions_LP6 g[]=new Excursions_LP6 [n];
        for(int i=0;i<n;i++)
        {
            g[i]= new Excursions_LP6();
            g[i].readData(in);
        }
        return g;
    }
}