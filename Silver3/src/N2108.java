import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] number = new int[N];
        int Total = 0;

        for(int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(br.readLine());
            Total += number[i];
        }
        Arrays.sort(number);

        for()

        System.out.println((int)Math.round((double)Total / N)); // 산술 평균
        System.out.println(number[(N/2)]); // 중앙값
        System.out.println(number[N-1] - number[0]); // 범위 출력

    }
}
