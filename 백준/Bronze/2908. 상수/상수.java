import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		// 1. 저장된 수를 reverse() 라는 메소드를 통해 저장되어있던 문자열을 뒤집는다
		// 2. 그리고 StringBuilder 타입을 문자열로 반환시키기 위해 toString() 을 써주면
		// 3. 문자열로 반환시켰으니 Integer.parseInt() 로 String 을 int 로 타입을 변경
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.print(A > B ?A:B);
		
	}
}