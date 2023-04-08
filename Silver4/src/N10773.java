import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] number = new int[Integer.parseInt(br.readLine())];

        for(int i = 0; i < number.length; i++)
            number[i] = Integer.parseInt(br.readLine());


    }
}
