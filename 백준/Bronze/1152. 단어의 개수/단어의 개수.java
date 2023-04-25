import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int num = 0;
		
		if(S.charAt(0)==' ') {
			if(S.charAt(S.length()-1)==' ') {
				for(int i=1; i<S.length(); i++) {
					if(S.charAt(i)==' ') {
						num++;
					}
				}
			}else {
				num++;
				for(int i=1; i<S.length(); i++) {
					if(S.charAt(i)==' ') {
						num++;
					}
				}
			}
		}else {
			if(S.charAt(S.length()-1)==' ') {
				for(int i=0; i<S.length(); i++) {
					if(S.charAt(i)==' ') {
						num++;
					}
				}
			}else {
				num++;
				for(int i=0; i<S.length(); i++) {
					if(S.charAt(i)==' ') {
						num++;
					}
				}
			}
		}
		System.out.println(num);		
	}
}