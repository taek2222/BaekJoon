import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine());
        String[] stray = str.nextToken().split("");
        long total = 0;
        for(int i = 0; i < L; i++) {
            char ch = stray[i].charAt(0);
            double square = Math.pow(31, i) % 1234567891;
            double number = (((int)ch - '`') * square);
            total += number;
        }
        System.out.println(total);
    }
}
