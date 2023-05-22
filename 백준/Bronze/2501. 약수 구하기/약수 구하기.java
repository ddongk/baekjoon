import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int num = 0;
		int no = 0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				num++;
			}
			if(num==k) {
				no=i;  //k번째 약수가 존재하지 않을 수도 있으니, 없을 경우 no=0 값이 그대로 나오게 따로 설정
				break;
			}
		}
		System.out.println(no);
	}
}