import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder bl = new StringBuilder();

        String[] str = br.readLine().split("");
        while(!str[0].equals(".")) {
            int i = 0;
            while(!(str[i].equals(".")) || !(i == -1) {
                switch (str[i]) {
                    case "(":
                        i = check1(str, i);
                        i++;
                        break;
                    case "[":
                        i = check2(str, i);
                        i++;
                        break;
                    case ")", "]":
                        i = -1;
                        break;
                    default:
                        i++;
                }
            }
            if(i == -1) bl.append("no\n");
            else bl.append("yes\n");
            str = br.readLine().split("");
        }
        System.out.println(bl);
    }

    public static int check1(String[] array, int i) {
        for(; i < array.length; ) {
            i++;
            switch (array[i]) {
                case "(":
                    i = check1(array, i);
                    break;
                case ")":
                    return i;
                case "[":
                    i = check2(array, i);
                    break;
                case ".":
                    return -1;
            }
        }
        return -1;
    }

    public static int check2(String[] array, int i) {
        for(; i < array.length; ) {
            i++;
            switch (array[i]) {
                case "[":
                    i = check2(array, i);
                    break;
                case "]":
                    return i;
                case "(":
                    i = check1(array, i);
                    break;
                case ".":
                    return -1;
            }
        }
        return -1;
    }
}
