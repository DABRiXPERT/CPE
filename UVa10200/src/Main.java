import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public Main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String[] range = new String[2];
		String raw, ans = "";
		while (!((raw = bReader.readLine())==null) && !(raw.isEmpty())) {
			int a, b, total = 0, qualify = 0;
			range = raw.split(" ");
			a = Integer.parseInt(range[0]);
			b = Integer.parseInt(range[1]);
			total = b - a + 1;
			qualify = realPrime(a, b);
			System.out.printf("%.2f\n", ((float)qualify/(float)total)*100);
		}
		System.out.println(ans);
	}
	public int realPrime(int a, int b) {
		int qualify = 0;
		int[] primeTable = new int[10000];
		for (int i = 0; i < primeTable.length; i++) {
			primeTable[i] = i*i+i+41;
		}
		for (int i = a; i <= b; i++) {
			boolean flag = false;
			int n = primeTable[i];
			for (int j = 2; j < n/2; j++) {
				if (n%j == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				qualify++;
			}
		}
		return qualify;
	}
	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		new Main();
	}

}
