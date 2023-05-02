import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double sub=0;//학점*과목평점
		double sum=0;//학점의 총합
		for(int i=0; i<20; i++) {
			st = new StringTokenizer(br.readLine());
			
			String a = st.nextToken();//무의미한 입력
			double b = Double.parseDouble(st.nextToken());//학점
			String c = st.nextToken();//과목평점
			
			
			if(c.equals("A+")) sub+=b*4.5;
			else if(c.equals("A0")) sub+=b*4;
			else if(c.equals("B+")) sub+=b*3.5;
			else if(c.equals("B0")) sub+=b*3;
			else if(c.equals("C+")) sub+=b*2.5;
			else if(c.equals("C0")) sub+=b*2;
			else if(c.equals("D+")) sub+=b*1.5;
			else if(c.equals("D0")) sub+=b*1;
			else if(c.equals("F")) 	sub+=0;
			else if(c.equals("P")) {
				sub+=0;
				b=0;
			}
			sum+=b;
		}
		System.out.printf("%.6f", sub/sum);
	}
}