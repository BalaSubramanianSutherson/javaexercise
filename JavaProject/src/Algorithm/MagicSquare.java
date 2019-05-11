package Algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MagicSquare {
	static int formingMagicSquare(int[][] s) {
		int a =  s[0][0] + s[0][1] + s[0][2];
		int b =  s[1][0] + s[1][1] + s[1][2];
		int c =  s[2][0] + s[1][1] + s[2][2];
		
		if(a!=15) {
			int dif = 15 > a?15-a:a-15;
			if(dif%2 != 0) {
				s[0][1] +=dif;
			}
		}
		return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
