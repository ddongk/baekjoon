import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        int sum=1;//현재 대각선라인 전부 포함해서의 합
        int beforeSum=0;//전 대각선까지의 합
        int odd=1;//홀수 짝수 구분 & 대각선 순서 & 대각선에 포함된 칸의 개수
        
        //    x = 3     ->   2/1        odd=2  (2번째 대각선)
        //    x = 4     ->   3/1        odd=3  (3번째 대각선)
        //    x = 8     ->   2/3        odd=4  (5번째 대각선)    
        //    x = 9     ->   3/2        odd=4  (5번째 대각선)    
        //    x = 10    ->   4/1        odd=4  (5번째 대각선)    

        while(true) {
        	if(x<=sum) {
        		if(odd%2==0) {//대각선이 짝수 번호(오른쪽위에서 아래왼쪽으로 향함)
        			//x-beforeSum//분자
        			//odd-(x-beforeSum)+1//분모
        			System.out.println((x-beforeSum)+"/"+(odd-(x-beforeSum)+1));
        			break;
        		}else {//대각선이 홀수 번호(왼쪽아래에서 오른쪽위로 향함)
        			//분모와 분자가 반대
        			System.out.println((odd-(x-beforeSum)+1)+"/"+(x-beforeSum));
        			break;
        		}
        	}else {
        		beforeSum+=odd;//odd++하기 전에 먼저 더해준다	
        		odd++;//
        		sum+=odd;//1 / 3 6 10
        	}
        }
    }
}
