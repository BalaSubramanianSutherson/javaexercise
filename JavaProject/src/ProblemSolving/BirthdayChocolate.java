package ProblemSolving;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BirthdayChocolate {

	static int birthday(List<Integer> s, int d, int m) {
		int count = 0 ; 
//		System.out.println(s.size());
		for(int i =0; i< s.size(); i++) {
			int sum = 0;
			for(int j = i, k =0; k<m && j< s.size(); j++, k++ ){
//				System.out.println(sum+"+"+s.get(j));
				sum += s.get(j);
			}
//			System.out.println(">>>>.."+sum);
			if(sum == d) {
				count++;
			}
		}
		return count;
				
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedReader bufferedReader = new BufferedReader(new
		// InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

//		int n = scanner.nextInt();

		/*
		 * List<Integer> s = Stream.of(scanner.nextLine().replaceAll("\\s+$",
		 * "").split(" ")) .map(Integer::parseInt) .collect(toList());
		 */

		// String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> s = Arrays.asList(4);
//		int d = scanner.nextInt();

//		int m = scanner.nextInt();
		
		int result = birthday(s, 4, 1);
		System.out.println(result);

	}

}
