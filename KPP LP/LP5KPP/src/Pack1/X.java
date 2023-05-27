package Pack1;

import java.util.Random;

public class X {
    Proto proto;
    X(Proto object){
        proto = object;
    }

    public void useAllProto(){
        Random random = new Random();
        System.out.println("До змін (прото в X):\n" + proto);
        proto.n = random.nextInt(0, 128);
        proto.protected_n = random.nextInt(128, 256);
        proto.public_n = random.nextInt(256, 512);
        System.out.println("Після модифікацій:\n" + proto);
    }

}
