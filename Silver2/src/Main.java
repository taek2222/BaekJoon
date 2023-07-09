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

        for(int average = 150; average < 250; average++) {
            System.out.println(" == " + average + " == ");
            System.out.print(total / average);
            System.out.print(" 1." + K_array[0] % average);
            System.out.print(" 2." + K_array[1] % average);
            System.out.print(" 3." + K_array[2] % average);
            System.out.print(" 4." + K_array[3] % average);
            System.out.println(" nam : " + (K_array[0] % average) + (K_array[1] % average) + (K_array[2] % average) + (K_array[3] % average));
        }
    }
}