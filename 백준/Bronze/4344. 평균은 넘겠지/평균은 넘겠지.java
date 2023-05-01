import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int[] a = new int[N];
			double sum=0;
			
			for(int j=0; j<N; j++) {
				a[j] = Integer.parseInt(st.nextToken());
				sum+=a[j];
			}
			double number = 0;
			for(int j=0; j<N; j++) {
				if(sum/N<a[j])
					number++;
			}
			System.out.printf("%.3f%%\n",(number/N)*100);//%% -> %
		}
	}
}