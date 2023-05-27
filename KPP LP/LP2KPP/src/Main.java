import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Firm> firms = new ArrayList<>();
        while(true){
            boolean is_break = false;
            int value = JOptionPane.showConfirmDialog(null, "Додати компанію?", "Туристична фірма", JOptionPane.YES_NO_OPTION);
            switch (value){
                case 1 -> {
                    is_break = true;
                    break;
                }
                case 0 -> {
                    int value_class = JOptionPane.showOptionDialog(
                            null,
                            "Виберіть із трьох функцій для створення компанії",
                            "Туристична фірма (крок 2)",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[]{"Рік заснування", "Кількість країн", "Ціни"},
                            "Рік заснування"
                    );
                    switch (value_class){
                        case 0 -> {
                            firms.add(new FirmYear());
                        }
                        case 1 -> {
                            firms.add(new FirmCountries());
                        }
                        case 2 -> {
                            firms.add(new FirmPrice());
                        }
                    }
                }
            }
            if (is_break){
                break;
            }
        }
        for (Firm firm:
                firms) {
            System.out.println(firm.promote() + "\n");
        }
    }
}
