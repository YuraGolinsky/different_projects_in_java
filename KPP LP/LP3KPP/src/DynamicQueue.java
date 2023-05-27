import java.util.ArrayList;
import java.util.List;

public class DynamicQueue implements intQueue {
    List<Integer> array;

    DynamicQueue(){
        array = new ArrayList<>();
    }

    @Override
    public int pop(int index) {
        return array.remove(index);
    }

    @Override
    public boolean insert(int value) {
        array.add(value);
        return true;
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
