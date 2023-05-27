public class FirmCountries extends Firm{
    @Override
    String promote(){
        String promo = super.promote();
        promo += String.format("Доставимо вас в будь-яку з %d країн!", getNumberOfCountries());
        return promo;
    }
}
