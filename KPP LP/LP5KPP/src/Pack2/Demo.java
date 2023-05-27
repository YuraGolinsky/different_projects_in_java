package Pack2;

import Pack1.Proto;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Random random = new Random();
        Proto proto = new Proto();
        System.out.println("До модифікації (прото в демо):\n" + proto);
        proto.public_n = random.nextInt(0, 128);
        System.out.println("Після модифікацій:\n" + proto);
        Derivative2 derivative2 = new Derivative2();
        derivative2.useAllProto();
    }

}
