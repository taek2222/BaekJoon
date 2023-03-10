import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class N2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> number = new ArrayList<>();

        int range = Integer.parseInt(br.readLine());
        for(int i = 1; i <= range; i++) {
            number.add(i);
        }

        System.out.print(number);
    }
}
