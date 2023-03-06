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
        int delete = Integer.parseInt(NK.nextToken()) - 1;

        for (int i = 1; i <= max; i++)
            number.add(i);

        for(int i = delete; number.size() > 1 ; i += delete) {
            if( i >= number.size() )
                i -= number.size();
            if( i == number.size() )
                i = 0;
            str.append(number.get(i)).append(", ");
            System.out.println(number.get(i));
            number.remove(i);
        }
        str.append(number.get(0));
        System.out.println("<"+str+">");
    }
}
