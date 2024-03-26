import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main{

	public main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String raw, ans = "";
		while (!((raw = bReader.readLine().strip()).charAt(0) == '0')) {
			int n = Integer.parseInt(raw);
			int top = 1, north = 2, west = 3;
			int temp;
			String[] op = new String[n];
			for (int i = 0; i < n; i++) {
				raw = bReader.readLine().strip();
				op[i] = raw;
			}
			for (int i = 0; i < op.length; i++) {
				if (op[i].equals("north")) {
					temp = north; north = top; top = Math.abs(7-temp);
				} else if (op[i].equals("south")) {
					temp = top; top = north; north = Math.abs(7-temp);
				} else if (op[i].equals("east")) {
					temp = top; top = west; west = Math.abs(7-temp);
				} else if (op[i].equals("west")) {
					temp = west; west = top; top = Math.abs(7-temp);
				} else {
					System.err.println("Wrong Input.");
				}
			}
			ans += String.format("%d\r\n", top);
		}
		System.out.print(ans);
	}
	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		new main();
	}

}
