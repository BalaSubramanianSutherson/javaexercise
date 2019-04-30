package Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MinimumSwaps {
	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != i + 1) {
				for (int j = i; j < arr.length-1; j++) {
					if (arr[j] == i + 1) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
						count++;
					}
				}
			} else {
				continue;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int res = minimumSwaps(arr);
		System.out.println(res);

//		bufferedWriter.write(String.valueOf(res));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}

}
