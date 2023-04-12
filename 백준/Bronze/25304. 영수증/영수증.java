import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int t = 0;
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			t += m*q;
		}
		
		if(x==t) System.out.println("Yes");
		else System.out.println("No");
		
		
	}
}