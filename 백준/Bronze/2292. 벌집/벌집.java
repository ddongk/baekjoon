import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	/*
    	 * 총 개수(층에 있는 칸 개수) |        해당 숫자
 		 * 1(1)                |  1층       1
    	 * 7(6)				   |  2층     2~7
    	 * 19(12)              |  3층     20~37
    	 * 37(18)              |  4층     38~61
    	 * 61(24)              |
    	 */
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        int sum=1;
        
        if(n==1) {
        	System.out.println(1);
        }else {
        	while(true) {
        		if(n<=sum) {
        			System.out.println(num);
        			break;
        		}else {
        			sum+=6*num;
        			num++;
        		}
        	}
        }

    }
}
