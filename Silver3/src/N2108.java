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

        for(int i = 0; i < N; i++)
            number[i] = Integer.parseInt(br.readLine());
        Arrays.sort(number);

        for(int i : number)
            Total += i;

        int result = (int)Math.round((double)Total / N);
        System.out.println(result); // 산술 평균

        System.out.println(number[(N-1)/2]); // 중앙값

        int[] plus = new int[4000];
        int[] subtract = new int[4000];
        for(int i = 0; i < N; i++)
            if(number[i] >= 0)
                plus[number[i]]++;
            else
                subtract[Math.abs(number[i])]++;

        for (int i = 0; i < 4000; i++) {
            System.out.println("+" + plus[i] + "" + i);
            System.out.println("-" + subtract[i] + "" + i);
        }

    }
}
