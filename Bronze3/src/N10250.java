import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            StringTokenizer HWN = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(HWN.nextToken());
            int W = Integer.parseInt(HWN.nextToken());
            int N = Integer.parseInt(HWN.nextToken());

            System.out.println((N % H) * 10 + "" + ((N / H)+1));
        }
    }
}
