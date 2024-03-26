import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class main {
	public main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String raw, ans = "";
		List<BigInteger> save = new ArrayList<BigInteger>();
		int[] form100 = {0,1,5,2,8,3,9,2,8,7,7,8,4,7,3,8,4,1,5,4,4,5,9,6,2,7,3,6,2,1,1,2,8,1,7,2,8,5,9,8,8,9,3,0,6,1,7,0,6,5,5,6,2,5,1,6,2,9,3,2,2,3,7,4,0,5,1,4,0,9,9,0,6,9,5,0,6,3,7,6,6,7,1,8,4,9,5,8,4,3,3,4,0,3,9,4,0,7,1,0};
		while (!((raw = bReader.readLine().strip()).contentEquals("0"))) {
			save.add(new BigInteger(raw));
		}
		for (int i = 0; i < save.size(); i++) {
			int mod100 = (save.get(i).mod(new BigInteger("100")).intValue());
			ans += String.format("%d\r\n", form100[mod100]);
		}
		System.out.print(ans);
	}
	public static void main(String[] args) throws IOException {
		new main();
	}
}