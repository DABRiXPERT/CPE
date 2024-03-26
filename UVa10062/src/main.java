import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.FormatFlagsConversionMismatchException;

public class main {

	public main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String raw, ans = "";
		boolean flag = false;
		while (!((raw = bReader.readLine())==null) && !(raw.isEmpty())) {
			if (flag) {
				ans += "\r\n";
			} else {
				flag = true;
			}
			int[] freq = new int[95];
			int max = 0;
			for (int i = 0; i < raw.length(); i++) {
				freq[(int)(raw.charAt(i))-32]++;
			}
			for (int i = 0; i < freq.length; i++) {
				if (freq[i] > max) {
					max = freq[i];
				}
			}
			for (int i = 1; i <= max; i++) {
				for (int j = freq.length-1; j >= 0; j--) {
					if (freq[j] == i) {
						ans += String.format("%d %d\r\n", (j+32), freq[j]);
					}
				}
			}
		}
		System.out.print(ans);
	}
	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		new main();
	}

}
