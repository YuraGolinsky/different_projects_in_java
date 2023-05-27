import java.util.Arrays;
import java.util.Scanner;

public class FixedQueue implements intQueue{
    int queueLen;
    int currentIndex;
    int[] array;

    FixedQueue(){
       System.out.print("Введіть кількість елементів: ");
       Scanner scanner = new Scanner(System.in);
       queueLen = scanner.nextInt();
       array = new int[queueLen];
    }

    @Override
    public int pop(int index) throws Exception {
        if(index > queueLen){
            throw new Exception("Індекс більший за довжину масиву");
        }
        int returnValue = array[index];
        for(int i = index; i < queueLen-1; i++){
            array[i] = array[i+1];
        }
        array[queueLen-1] = 0;
        currentIndex--;
        return returnValue;
    }

    @Override
    public boolean insert(int value) {
        if(currentIndex == queueLen){
            return false;
        }
        array[currentIndex] = value;
        currentIndex++;
        return true;
    }

    public String toString(){
        return Arrays.toString(array);
    }
}
