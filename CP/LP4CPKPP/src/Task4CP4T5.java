

import java.util.Random;
public class Task4CP4T5 {

    public static void main(String[] args)
    {
        int[] arr = new int[5];
        Random rnd = new Random();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rnd.nextInt();
            System.out.println("arr["+i+"]="+arr[i]);
        }
        System.out.println("Числа в массиве сгенерированы.");

        for(int i=1;i<arr.length;i+=2)
        {
            try
            {
                System.out.println(arr[i] + " / " + arr[i-1] + " = " + (double)arr[i]/arr[i-1]);
            }
            catch(ArrayIndexOutOfBoundsException exc)
            {
                System.out.println("Деление на ноль невозможно.");
            }

        }
    }
}