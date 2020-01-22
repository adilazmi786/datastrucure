package adil.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RemoveCol {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// BufferedReader
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String name = br.readLine(); // Reading input from STDIN
		// System.out.println("Hi, " + name + "."); // Writing output to STDOUT
		Scanner s = new Scanner(System.in);

		System.out.println("Enter row: ");
		int row = s.nextInt();
		System.out.println("Enter column: ");
		int col = s.nextInt();

		char mat[][] = new char[row][col];
		for (int i = 0; i < row; i++) {
			int j=0;
			String str=s.next();
			while(j<col)
				mat[i][j] = str.charAt(j++);
		}
		
		System.out.println("Matrix is: ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		s.close();
		int operation = 0;
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (j < row - 1 && mat[j+1][i] < mat[j][i]) {
					operation++;
					break;
				}
			}
		}
		System.out.println("Number of operation:"+operation);
	}

}
