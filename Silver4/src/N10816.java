import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N10816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder print = new StringBuilder();

        int[] card = new int[Integer.parseInt(br.readLine())];
        StringTokenizer num = new StringTokenizer(br.readLine());

        for(int i = 0; i < card.length; i++)
            card[i] = Integer.parseInt(num.nextToken());
        Arrays.sort(card); // N개의 카드 정렬 마침.

        int[] card2 = new int[Integer.parseInt(br.readLine())];
        StringTokenizer num1 = new StringTokenizer(br.readLine());

        for(int i = 0; i < card2.length; i++)
            card2[i] = Integer.parseInt(num1.nextToken()); // M개의 카드 입력 완료.

        for(int i = 0; i < card2.length; i++) {
            int number = card2[i];
            int first = 0;
            int last = card.length;
            while(first < last) {
                int mid = (first + last) / 2;
                if(card[mid] == number)
                    break;
                if(card[mid] > number)
                    last = mid;
                else
                    //first = mid+1;
            }
            while(number == card[first]) {
                first--; // 같은 수 최하 인덱스로 이동
                if(first < 0)
                    break;
            }
            first++;

            System.out.println(first + " 처음  first 값 ");
            int count = 0;
            while(number == card[first]) {
                count++;
                first++;
                if(first == card.length)
                    break;
            }
            System.out.println(first + " 마지막 first 값 ");
            print.append(count).append(" ");
        }
        System.out.print(print);
    }
}
