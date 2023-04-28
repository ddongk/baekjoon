import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // 영문자의 개수
		String s = br.readLine();
		
 
		for (int i=0; i<s.length(); i++) {
			if (97 <= s.charAt(i) && s.charAt(i) <= 122) {//소문자의 범위: 97~122
				arr[s.charAt(i) - 97]++;
			} else {//대문자의 범위: 65~90
				arr[s.charAt(i) - 65]++;
			}
		}
		
		int max = 0;
		char q = '?';
		for (int i=0; i<26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				q = (char) (i + 65);//대문자로 출력
			} 
			else if (arr[i] == max) {
				q = '?';
			}
		}
		System.out.print(q);
	}
 
}