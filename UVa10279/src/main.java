import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String raw;
		while ((raw=bReader.readLine().strip())!=null && raw.length()!=0) {
			int n = Integer.parseInt(raw);
			String[] data = new String[n];
			int[] freq = new int[26];
			for (int i = 0; i < n; i++) {
				data[i] = bReader.readLine();
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < data[i].length(); j++) {
					data[i] = data[i].toUpperCase();
					char c = data[i].charAt(j);
					if (Character.isUpperCase(c)) {
						freq[(int)(c)-65] += 1;
					}
				}
			}
			int max = 0;
			for (int i = 0; i < freq.length; i++) {
				if (freq[i] > max) {
					max = freq[i];
				}
			}
			for (int i = max; i > 0; i--) {
				for (int j = 0; j < freq.length; j++) {
					if (i == freq[j]) {
						System.out.println((char)(j+65) + " " + freq[j]);
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		new main();
	}

}
