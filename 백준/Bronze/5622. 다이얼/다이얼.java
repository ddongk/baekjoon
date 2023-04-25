import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String s = br.readLine();        
		int count=0;
        
		for(int i=0; i<s.length(); i++) {
        
			switch(s.charAt(i)) {
			case 'A' : case 'B': case 'C' : 
				count += 3; 
				break;               
			case 'D' : case 'E': case 'F' : 
				count += 4; 
				break;                
			case 'G' : case 'H': case 'I' : 
				count += 5; 
				break;                
			case 'J' : case 'K': case 'L' : 
				count += 6; 
				break;                
			case 'M' : case 'N': case 'O' : 
				count += 7; 
				break;                
			case 'P' : case 'Q': case 'R' : case 'S' :
				count += 8; 
				break;               
			case 'T' : case 'U': case 'V' : 
				count += 9; 
				break;              
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				count += 10; 
				break;
			}
			/*
			if(s.charAt(i) < 68) count += 3; A:65 B:66 C:67
			else if(s.charAt(i) < 71) count += 4;
			else if(s.charAt(i) < 74) count += 5;
			else if(s.charAt(i) < 77) count += 6;
			else if(s.charAt(i) < 80) count += 7;
			else if(s.charAt(i) < 84) count += 8;
			else if(s.charAt(i) < 87) count += 9;
			else count += 10;
			 */
		}		
		System.out.print(count);
	}
}