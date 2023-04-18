import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0;
        int a=0;
        int num;
        
        for (int i = 1; i <= 9; i++) {
            num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                a=i;
            }
        }
        System.out.println(max);
        System.out.println(a);
    }
}