import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] a = new int[101][101];//길이가 100, 100이면 (0,0)포함해서 총 101, 101개
		
		int total = 0; //넓이
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int q=100-x; q>100-x-10; q--) {
				for(int w=y; w<y+10; w++) {
					a[q][w]+=1;
					if(a[q][w]==1) {//1이상은 겹치는 것으로 제외
						total++;
					}
				}
			}			
		}
		System.out.println(total);
		
	}
}