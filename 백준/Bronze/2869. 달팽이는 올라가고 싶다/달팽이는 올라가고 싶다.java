import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int v= Integer.parseInt(st.nextToken());
        //"정상에 올라간 후에는 미끄러지지 않는다"라는 말이 있기에
        //딱 맞아 떨어지는 날 or 전 날에 멈추고, 나머지가 생기면 하루를 추가
        int day = (v-b)/(a-b);
		if ((v - b) % (a - b) != 0) {// 나머지가 있을 경우 (잔여 블럭이 있을 경우->하루가 더 소모 되기에 하루 추가)
			day++;
		}
		System.out.println(day);
        
        /* 이렇게 풀어도 정답이지만, 시간초과
        int sum=0;
        int day=1;        
        while(true) {
        	sum+=a;
        	if(sum>=v) {
        		System.out.println(day);
        		break;
        	}else {
        		sum-=b;
            	day++;
        	}        	
        }
        */
    }
}
