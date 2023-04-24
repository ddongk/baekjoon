import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int[] arr = new int[26];//알파벳 개수(a~z)
		
		for(int i = 0; i < arr.length; i++) { //처음에 모든 알파벳을 -1로 설정
			arr[i] = -1;
		}
 
		String S = br.readLine();
 
		for(int i = 0; i < S.length(); i++) {//입력한 문자열 S의 길이만큼 반복
			char ch = S.charAt(i); //charAt() 메소드를 사용하여 문자 추출
    
			if(arr[ch-97] == -1) {	//동일 문자가 포함되어있는 경우 처음 나타난 위치가 나오게 한다 -> arr 원소 값이 -1 인 경우에만 변경
				arr[ch-97] = i;     //'a' 또는 97 을 빼준다
			}
		}
 
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
}