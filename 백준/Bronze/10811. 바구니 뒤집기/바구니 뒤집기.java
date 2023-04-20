import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];

        for(int i=0; i<N; i++) {
        	arr[i]=i+1;
        }
        
        for(int i=0; i<M; i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());

        	for(int j=a;j<=b;j++,b--) {
        		int time = arr[j-1];
        		arr[j-1] = arr[b-1];
        		arr[b-1] = time;
        	}
        }
        for(int x : arr) {
        	System.out.print(x+" ");
        }
	}
}