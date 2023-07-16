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

        System.out.println(number[(N/2)]); // 중앙값

        int count = 0;
        int mode_max = 0;
        int mode = 10000;
        boolean flag = false;

        for(int i = number[0] + 4000; i <= number[N-1] + 4000; i++)

            if(number[i] > 0) {
                if(mode_max < number[i]) {
                    mode_max = number[i];
                    mode = i - 4000;
                    flag = true;	// 첫 등장이므로 true 로 변경
                }
                // 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
                else if(mode_max == number[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }

        System.out.println(mode);	// 최빈값

        System.out.println(number[N-1] - number[0]); // 범위 출력

    }
}
