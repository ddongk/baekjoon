import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String x= "*";
        
        for (int i=1; i<=t; i++) {
        	for(int j=t;j>i;j--) {
            	sb.append(" ");
        	}
            sb.append(x);
            sb.append("\n");
            x+="*";
        }
        System.out.println(sb);
	}
}