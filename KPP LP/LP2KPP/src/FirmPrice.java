public class FirmPrice extends Firm{
    @Override
    String promote(){
        String Promo = super.promote();
        float[] MinAndMax = getMinMax();
        Promo += String.format("Найбільше різноманіття цін, від %1.2f, і до %1.2f", MinAndMax[0], MinAndMax[1]);
        return Promo;
    }
}
