import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) {// getBytes() 는 문자열을  byte 배열로 반환
			sum += (value-48);	//  '0' 또는 48을 뺀다
		}
		
		System.out.print(sum);
		
	}
}