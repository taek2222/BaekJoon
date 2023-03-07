import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numberarray = new int[Integer.parseInt(br.readLine())];
        StringTokenizer str = new StringTokenizer(br.readLine());

        for (int i = 0; i < numberarray.length; i++)
            numberarray[i] = Integer.parseInt(str.nextToken());

        for (int i = 0; i < numberarray.length; i++)

    }
}