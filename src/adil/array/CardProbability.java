package adil.array;

import java.text.DecimalFormat;
import java.util.*;

public class CardProbability {

	public static void main(String args[]) throws Exception {
		// Scanner
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		DecimalFormat df = new DecimalFormat("0.0000000000");

		// Reading input from STDIN
		// System.out.println("Hi, " + name + "."); // Writing output to STDOUT
		for (int i = 0; i < t; i++) {
			int x = s.nextInt();
			int n = s.nextInt();
			int d = s.nextInt();
			String k = s.nextLine();
			System.out.println(df.format((1 /(double)x)));
			System.out.println(String.format("%.10f", ((1 /(double)x))));

		}
	}
}
