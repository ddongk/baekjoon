import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		
		/* 오답
		 * 무한반복됨
		String str = br.readLine();
		while(str!=null){
			System.out.println(str);
		}
		*/
	}
}