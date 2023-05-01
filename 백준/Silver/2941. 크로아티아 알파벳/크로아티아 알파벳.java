import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int count = n.length();
		
		//마지막 글자에서 오류가 나기 때문에
		//i<n.length()-1 조건을 준다 (dzn의 경우 -2)
		for(int i=0; i<n.length(); i++) {
			if(n.charAt(i)=='c'&& i<n.length()-1) {
				if(n.charAt(i+1)=='='||n.charAt(i+1)=='-') {
					count --;
					i++;
				}
			}
			if(n.charAt(i)=='d'&& i<n.length()-2) {
				if(n.charAt(i+1)=='z') {
					if(n.charAt(i+2)=='=') {
						count --;
						count --;
						i++;
						i++;
					}
				}
			}
			if(n.charAt(i)=='d'&& i<n.length()-1) {
				if(n.charAt(i+1)=='-') {
					count --;
					i++;
				}
			}
			if(n.charAt(i)=='l'&& i<n.length()-1) {
				if(n.charAt(i+1)=='j') {
					count --;
					i++;
				}
			}
			if(n.charAt(i)=='n'&& i<n.length()-1) {
				if(n.charAt(i+1)=='j') {
					count --;
					i++;
				}
			}if(n.charAt(i)=='s'&& i<n.length()-1) {
				if(n.charAt(i+1)=='=') {
					count --;
					i++;
				}
			}
			if(n.charAt(i)=='z'&& i<n.length()-1) {
				if(n.charAt(i+1)=='=') {
					count --;
					i++;
				}
			}
		}
			System.out.println(count);	
	}
}