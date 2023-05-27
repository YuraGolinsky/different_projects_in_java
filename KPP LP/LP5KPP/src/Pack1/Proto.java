package Pack1;

import java.util.Random;

public class Proto {// пакет

    int n = 1;
    private int private_n = 2;
    protected int protected_n = 3;
    public int public_n = 4;

    public String toString(){
        return String.format(
                "Proto:\nn: %d | private_n: %d\nprotected_n: %d | public_n: %d\n",
                n,
                private_n,
                protected_n,
                public_n
        );
    }

    public static void main(String[] args){
        Proto proto = new Proto();
        System.out.println("До модифікації (proto в Proto):\n" + proto);
        Random random = new Random();
        proto.n = random.nextInt(0, 128);
        proto.private_n = random.nextInt(128, 256);
        proto.protected_n = random.nextInt(256, 512);
        proto.public_n = random.nextInt(512, 1024);
        System.out.println("After:\n" + proto);
        Derivative derivative = new Derivative();
        derivative.useAllProto();
        X x = new X(proto);
        x.useAllProto();
    }

}
