import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        //ex) n=5
        for(int i=1; i<=n; i++) {//n=1 2 3 4 5
            for (int j=1; j<=n-i; j++) {//1개 단위의 띄어쓰기
                sb.append(" ");
            }
            for (int j=1; j<=2*i-1; j++) {//홀수 개로 올라감
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=n-1; i>=1; i--) {//n=4 3 2 1
            for (int j=1; j<=n-i; j++) {
                sb.append(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}