package Pack1;

import java.util.Random;

public class Derivative extends Proto {

    public void useAllProto(){
        Random random = new Random();
        System.out.println("До модифікацій (це в похідній формі):\n" + this);
        n = random.nextInt(0, 128);
        protected_n = random.nextInt(128, 256);
        public_n = random.nextInt(256, 512);
        System.out.println("Після модифікацій:\n" + this);
    }

}
