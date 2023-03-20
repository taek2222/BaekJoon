import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer KN = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(KN.nextToken());
        int N = Integer.parseInt(KN.nextToken());

        int[] K_array = new int[K];
        int total = 0;
        for(int i = 0; i < K; i++) {
            K_array[i] = Integer.parseInt(br.readLine());
            total += K_array[i];
        }

        int average = total / N;

        for(; ;average--) {
            int get = 0;
            for(int j = 0; j < K_array.length; j++)
                get += (K_array[j] / average);
            if (get == N) {
                System.out.println(average);
                System.exit(0);
            }
        }
    }
}