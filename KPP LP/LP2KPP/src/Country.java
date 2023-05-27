import javax.swing.*;

public class Country {
    private String CountryName;
    private float minPrice;
    private float maxPrice;

    float[] getPrices(){
        return new float[] {minPrice, maxPrice};
    }

    String showCountry(){
        return String.format("Country: %s, prices: %1.2f to %1.2f", CountryName, minPrice, maxPrice);
    }

    Country(){
        CountryName = JOptionPane.showInputDialog("Введіть назву країни", "Україна");
        try {
            minPrice = Float.parseFloat(JOptionPane.showInputDialog("Введіть мінімальну ціну подорожі"));
            maxPrice = Float.parseFloat(JOptionPane.showInputDialog("Введіть максимальну ціну подорожі"));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
