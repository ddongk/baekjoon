import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());	
		int M = Integer.parseInt(st.nextToken());
		      
        int[] x = new int[N];
        
        for(int i=0;i<N;i++) {
        	x[i]=i+1;
        }
        
        for(int a=0;a<M;a++) {
        	st = new StringTokenizer(br.readLine());
        	int i = Integer.parseInt(st.nextToken());	
        	int j = Integer.parseInt(st.nextToken());	
        	int k = Integer.parseInt(st.nextToken());
        	
        	int[] y = new int[j-i+1];
        	
        	int z = 0;
        	for(int b=k;b<=j;b++) {
        		y[z]=x[b-1];
        		z++;
        	}
        	z=j-k+1;
        	for(int b=i;b<k;b++) {
        		y[z]=x[b-1];
        		z++;
        	}
        	z=0;
        	for(int b=i;b<=j;b++) {
        		x[b-1]=y[z];
        		z++;
        	}
        }

    	for(int c : x) {
    		System.out.print(c+" ");
    	}
    }
}