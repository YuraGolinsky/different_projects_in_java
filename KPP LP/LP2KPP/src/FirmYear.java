public class FirmYear extends Firm {
    @Override
    String promote(){
        String promo = super.promote();
        promo += String.format("З вами з %d року!", getFounded());
        return promo;
    }
}
