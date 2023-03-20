import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder bl = new StringBuilder();

        int number = 0;
        while(true) {
            String[] str = br.readLine().split("");
            int check = 0;
            int check1 = 0;
            for(int i = 0; i < str.length ; i++) {
                if(str[i].equals("("))
                    check++;
                if(str[i].equals(")"))
                    check--;
                if(str[i].equals("["))
                    check1++;
                if(str[i].equals("]"))
                    check1--;
                if(check < 0 || check1 < 0) {
                    bl.append("no");
                    break;
                }
            }
            number++;

        }
    }
}
