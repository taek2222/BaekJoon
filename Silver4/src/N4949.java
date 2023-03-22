import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder bl = new StringBuilder();

        int number = 0;
        String[] str = br.readLine().split("");
        while(!str[0].equals(".")) {
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
                    bl.append("no\n");
                    break;

                }
            }
            if(check == 0 && check1 == 0) {
                bl.append("yes\n");
            }
            number++;

            str = br.readLine().split("");
        }
        System.out.println(bl);
    }
}
