import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
 
		
		for (int i=0; i<10; i++) {
			h.add(Integer.parseInt(br.readLine())%42);
		}
		//중복되는 원소를 넣을 경우 하나만 저장(중복원소를 허용하지 않는다)
		//정렬을 하고 싶다면 리스트로 변환 후 정렬
		
		System.out.print(h.size());//개수
	}
}