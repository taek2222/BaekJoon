import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());

        for(int i = 0, total = 0; i < loop; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            String[] strarry = str.nextToken().split("");
            for (int j = 0; j < 10; j++) {
                //if(strarry[j] == "O")
                    //total++;
                System.out.print(strarry[j]);
            }
            System.out.println(total);
            total = 0;
        }
    }

}
