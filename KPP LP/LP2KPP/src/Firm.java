import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Firm {

    private String FirmName;
    private int Founded;
    private List<Country> Countries = new ArrayList<>();

    int getNumberOfCountries(){
        return Countries.size();
    }
    int getFounded(){
        return Founded;
    }
    String getFirmName(){
        return FirmName;
    }
    float[] getMinMax(){
        float[] minMax = {Float.MAX_VALUE, Float.MIN_VALUE};
        for (Country c:
                Countries) {
            float[] cur = c.getPrices();
            if (cur[0] < minMax[0]){
                minMax[0] = cur[0];
            }
            if (cur[1] > minMax[1]){
                minMax[1] = cur[1];
            }
        }
        return minMax;
    }

    String promote(){
        return "Фірма: " + getFirmName() + "\n";
    }

    Firm(){
        FirmName = JOptionPane.showInputDialog("Введіть назву фірми");
        try{
            Founded = Integer.parseInt(JOptionPane.showInputDialog("Введіть рік засновання компанії"));
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
        while(true){
            boolean is_break = false;
            int value = JOptionPane.showConfirmDialog(null, "Додати країну?", "Створення фірми", JOptionPane.YES_NO_OPTION);
            switch (value) {
                case 1 -> {
                    is_break = true;
                }
                case 0 -> {
                    Countries.add(new Country());
                }
            }
            if (is_break){
                break;
            }
        }
    }

}
