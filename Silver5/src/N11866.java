import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        ArrayList<Integer> number = new ArrayList<Integer>();
        StringTokenizer NK = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(NK.nextToken());
        int delete = Integer.parseInt(NK.nextToken());

        for (int i = 1; i <= max; i++)
            number.add(i);

        while(!((number.size()) == 1)) {
            str.append(number.get(delete)).append(", ");
            number.remove(delete);
        }

        System.out.println(str);
    }
}
