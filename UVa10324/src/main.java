import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public main() throws Exception, IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int cases = 1;
		String raw;
		while((raw=bReader.readLine())!=null && raw.length()!=0) {
			String ans = "";
			int n = Integer.parseInt(bReader.readLine());
			int[][] data = new int[n][2];
			for (int i = 0; i < n; i++) {
				String[] rawPos = bReader.readLine().split(" ");
				data[i][0] = Integer.parseInt(rawPos[0]);
				data[i][1] = Integer.parseInt(rawPos[1]);
				String temp = raw.substring(Math.min(data[i][0], data[i][1]), Math.max(data[i][0], data[i][1])+1);
				int sum = 0;
				for (int j = 0; j < temp.length(); j++) {
					sum += ((int)temp.charAt(j))-48;
				}
				if (sum == 0 || sum == temp.length()) {
					ans += "Yes\r\n";
				}
				else {
					ans += "No\r\n";
				}
			}
			System.out.println("Case "+cases+":");
			System.out.print(ans);
			cases++;
		}
	}
	public static void main(String[] args) throws IOException, Exception {
		// TODO 自動產生的方法 Stub
		new main();
	}
}
