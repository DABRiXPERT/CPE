import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public Main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String raw, ans = "";
		int x = 1;
		while ((raw = bufferedReader.readLine().strip()).charAt(0) != '0') {
			int n = Integer.parseInt(raw);
			String[] nraws = new String[n];
			for (int i = 0; i < nraws.length; i++) {
				nraws[i] = bufferedReader.readLine();
			}
			raw = bufferedReader.readLine();
			int m = Integer.parseInt(raw);
			String[] mraws = new String[m];
			for (int i = 0; i < mraws.length; i++) {
				mraws[i] = bufferedReader.readLine();
			}
			// PRE
			if (n != m) {
				ans += String.format("Run #%d: Wrong Answer!\n", x);
			} else {
				// AC
				int flagac = 0;
				for (int i = 0; i < n; i++) {
//					System.out.println(i);
//					System.out.println(nraws[i]);
//					System.out.println(mraws[i]);
					if (!(nraws[i].equals(mraws[i]))) {
						flagac++;
					}
					if (flagac != 0) {
						break;
					}
				}
				if (flagac != 0) {
					// PE
					int flagpe = 0;
					for (int i = 0; i < n; i++) {
//						System.out.println(i);
//						System.out.println(onlyNumbers(nraws[i]));
//						System.out.println(onlyNumbers(mraws[i]));
//						System.out.println(onlyNumbers(nraws[i]).equals(onlyNumbers(mraws[i])));
						if (!(onlyNumbers(nraws[i]).equals(onlyNumbers(mraws[i])))) {
							flagpe++;
						}
//						System.out.println("flagpe = "+flagpe);
						if (flagpe != 0) {
							break;
						}
					}
					// WA
					if (flagpe != 0) {
						ans += String.format("Run #%d: Wrong Answer\r\n", x);
					} else {
						ans += String.format("Run #%d: Presentation Error\r\n", x);
					}
				} else {
					ans += String.format("Run #%d: Accepted\r\n", x);
				}
			}
			x++;
		}
		System.out.print(ans);
	}
	public String onlyNumbers(String bef) {
		String aft = "";
		for (int i = 0; i < bef.length(); i++) {
			if (Character.isDigit(bef.charAt(i))) {
				aft += bef.charAt(i);
			}
		}
		return aft;
	}
	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		new Main();
	}

}
