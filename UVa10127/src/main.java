import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class main {

	public main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String raw;
		while (!((raw = bReader.readLine())==null) && !(raw.isEmpty())) {
			String current = "1";
			BigInteger dividend = new BigInteger(current);
			BigInteger divisor = new BigInteger(raw);
			BigInteger mod = new BigInteger(dividend.remainder(divisor).toString());
			while (mod.toString().compareTo("0") != 0) {
				current += "1";
				dividend = new BigInteger(current);
				mod = new BigInteger(dividend.remainder(divisor).toString());
			}
			System.out.println(current.length());
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		new main();
	}

}
