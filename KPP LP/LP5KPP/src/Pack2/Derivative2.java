package Pack2;

import Pack1.Proto;

import java.util.Random;

public class Derivative2  extends Proto {

    public void useAllProto(){
        Random random = new Random();
        System.out.println("До змін (це в Derivative2):\n" + this);
        protected_n = random.nextInt(128, 256);
        public_n = random.nextInt(256, 512);
        System.out.println("Після модифікацій:\n" + this);
    }

}
