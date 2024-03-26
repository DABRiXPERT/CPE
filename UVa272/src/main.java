import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	
	public main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String raw;
		int count = 1;
		while (!((raw = bReader.readLine()).contentEquals("")) && raw.length()!=0) {
			for(int i=0;i<raw.length();i++){
				if(raw.charAt(i)=='"' && count%2==1){
					System.out.print("``");
					count++;
				}else if(raw.charAt(i)=='"' && count%2==0){
					System.out.print("''");
					count++;
				}else{
					System.out.print(raw.charAt(i));
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		new main();
	}
}
