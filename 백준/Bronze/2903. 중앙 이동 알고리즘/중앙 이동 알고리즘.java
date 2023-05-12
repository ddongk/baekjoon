import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        //초기 상태
        int square = 1;//사각형 개수
        int line = 1;//변의 총 개수
        int sum = 4;//점의 총 개수
        
        //점의 총 개수=(전의 점의 총 개수)+(전의 사각형 총 개수)+변의길이
        //변의 길이=1*2  +  1*2
        //        2*3  +  2*3
        //         4*5  +  4*5     
        //       (2의 배수)*(2의 배수 + 1)  +  (2의 배수)*(2의 배수 + 1)
        for(int i=0; i<t; i++) {
        	sum=sum+square+(line*(line+1))+(line*(line+1));
        	square=square*4;
        	line=line*2;
        }
        System.out.println(sum);
    }
}
