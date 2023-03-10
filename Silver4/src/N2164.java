import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class N2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> number = new ArrayList<>();

        int range = Integer.parseInt(br.readLine());
        for(int i = 1; i <= range; i++)
            number.add(i);

        System.out.println("생성 완료");

        while(!(number.size() == 1)) {
            number.remove(0);
            number.add(number.get(0));
            number.remove(0);
        }
        System.out.println(number.get(0));
    }
}
