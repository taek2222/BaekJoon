import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class N2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        String strsave = str.nextToken();
        String[] array = strsave.split("");
        int range = array.length * 9;

        int number = Integer.parseInt(strsave);
        int constructor = 10000000;

        for(int i = number; i >= number-range; i--) {
            int[] arrnum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
            int numbercomparison = i;
            for(int j = 0; j < arrnum.length; j++) {
                numbercomparison += arrnum[j];
            }
            if(numbercomparison == number)
                if(constructor > i)
                    constructor = i;
        }

        if(constructor == 10000000)
            System.out.println(0);
        else
            System.out.print(constructor);
    }
}
