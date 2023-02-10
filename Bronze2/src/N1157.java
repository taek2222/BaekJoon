import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N1157 {
    public static void main(String[] args) throws IOException {
        System.gc();
        long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int check = 0;
        int[] number = new int[26];
        Arrays.fill(number, 0);

        String str = br.readLine();
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++)
            number[(int) str.toCharArray()[i] - 65]++;

        int maxindex = 0, max = number[0];

        for (int i = 1; i < number.length; i++)
            if (max < number[i]) {
                max = number[i];
                maxindex = i;
            }

        for (int j : number)
            if (max == j)
                check++;


        if (check >= 2)
            System.out.println("?");
        else
            System.out.println((char)(maxindex + 65));

        System.gc();
        long after  = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long usedMemory = (before - after)/1024/1024;

        System.out.println("Used Memory : " + usedMemory);
    }
}
