import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
	public main() throws IOException {
		// TODO 自動產生的建構子 Stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String raw;
		String[] raws;
		int x;
		while ((raw=bReader.readLine())!=null && raw.length()!=0) {
			List<Integer> coef = new ArrayList<Integer>();
			x = Integer.parseInt(raw);
			raws = bReader.readLine().split(" ");
			for (int i = raws.length-1; i >= 0 ; i--) {
				coef.add(Integer.parseInt(raws[i]));
			}
			for (int i = 0; i < coef.size(); i++) {
				coef.set(i, coef.get(i)*i);
			}
			coef.remove(0);
			long ans = 0;
			for (int i = 0; i < coef.size(); i++) {
				ans += coef.get(i)*(int)Math.pow(x, i);
			}
			System.out.println(ans);
		}
	}
	public static void main(String[] args) throws IOException {
		new main();
	}
}
