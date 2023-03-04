import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] memberage = new int[Integer.parseInt(br.readLine())];
        String[] membername = new String[memberage.length];
        StringBuilder str = new StringBuilder();
        String[][] member = new String[memberage.length][2];

        for(int i = 0; i < memberage.length; i++) {
            StringTokenizer agename = new StringTokenizer(br.readLine());
            memberage[i] = Integer.parseInt(agename.nextToken());
            membername[i] = agename.nextToken();
        }

        for(int i = 0; i < memberage.length; i++) {
            int position = 0;
            for(int j = 0; j < memberage.length; j++) {
                if (memberage[i] > memberage[j]) {
                    position++;
                    continue;
                }
                if (memberage[i] == memberage[j]) {
                    if (!(membername[i].equals(membername[j])))
                        if (i > j)
                            position++;
                }
            }
            member[position][0] = String.valueOf(memberage[i]);
            member[position][1] = membername[i];
        }

        for (int i = 0; i < memberage.length; i++) {
            str.append(member[i][0]).append(" ");
            str.append(member[i][1]).append("\n");
        }

        System.out.print(str);
    }
}
