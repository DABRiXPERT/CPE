import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String raw, ans = "";
		while (!((raw = bReader.readLine())==null) && !(raw.isEmpty())) {
			int last=-1, now=-1;
			for (int i = 0; i < raw.length(); i++) {
				switch (raw.charAt(i)) {
					case 'B':
					case 'F':
					case 'P':
					case 'V':
						now = 1;
						break;
					case 'C':
					case 'G':
					case 'J':
					case 'K':
					case 'Q':
					case 'S':
					case 'X':
					case 'Z':
						now = 2;
						break;
					case 'D':
					case 'T':
						now = 3;
						break;
					case 'L':
						now = 4;
						break;
					case 'M':
					case 'N':
						now = 5;
						break;
					case 'R':
						now = 6;
						break;
					default:
						now = 0;
				}
				if (now != last) {
					if (now != 0) {
						ans += String.format("%d", now);
					}
					last = now;
				}
			}
			ans += "\r\n";
		}
		System.out.print(ans);
	}
	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		new main();
	}

}
