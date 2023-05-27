import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2CP2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double S=0;
        double x = Double.parseDouble(r.readLine());
        double j = 2; // число в знаминателе,что умножается на x
        double k = 2; // число в знаминателе,что плюсуется к (2*x)
        for(int i = 1; i <= 2;i++){
            S += x/(j*x+k)-x/(2+2)-x/(4+3)+x/(6+4); // сам пример
            j *= 2;
            k *= 2;

        }
        System.out.println(S);
    }
}