import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//BigInteger: long형을 넘어가는 매우 큰 수에 대해서 사용
		BigInteger A = new BigInteger(st.nextToken());//
		BigInteger B = new BigInteger(st.nextToken());
		
		//add() 메서드는 해당 BigInteger 객체와 -> A
		//파라미터(인자)로 들어온 BigInteger객체의 -> B
		//더한 값을 BigInteger 타입으로 반환
		 
		A = A.add(B);
		System.out.println(A.toString());
	}
}