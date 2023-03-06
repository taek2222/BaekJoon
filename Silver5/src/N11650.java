import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] number = new int[Integer.parseInt(br.readLine())][2];

        for(int i = 0; i < number.length; i++) {
            StringTokenizer num = new StringTokenizer(br.readLine());
            number[i][0] = Integer.parseInt(num.nextToken());
            number[i][1] = Integer.parseInt(num.nextToken());
        }
        Arrays.sort(number, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });

        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i][0]);
            System.out.println(number[i][1]);
        }
    }
}
