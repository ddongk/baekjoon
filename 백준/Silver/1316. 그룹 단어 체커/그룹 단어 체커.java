import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<n; i++) {
			String st = br.readLine();
			int t=0;
			if(st.length()==1) {
				count++;
			}else {
				for(int j=0; j<st.length()-1;j++) {
					if(st.charAt(j)!=st.charAt(j+1)) {
						for(int k=0; k<j+1; k++) {
							if(st.charAt(k)==st.charAt(j+1)) {
								t++;
							}
						}
						
					}
					
				}
				if(t==0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}