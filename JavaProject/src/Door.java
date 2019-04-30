
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
public class Door {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*List<Integer> list = Arrays.asList(1,2,4,5,6,8);
		IntSummaryStatistics  statistics= list.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(statistics.getMax());
		
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).sorted().collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);*/
//		System.out.print(String.format("%s%10s", "bala"));
		System.out.println("Role >>" + args[0]);
		System.out.println("Role >>" + args[1]);
		System.out.println(String.format("%03d", 3));
	
		int value = 1;
	
		for (int i = 1; i <= 5; i++) {
			boolean iseven = false;
			if (i % 2 == 0) {
				iseven = true;
				value = value + i;
			}
			for (int j = 1; j <= i; j++) {
				if (iseven) {
					System.out.print(--value +" ");

				} else {
					System.out.print(value+" ");	
					value++;
				}
			}
			if (iseven) {
				value = value + i;
			}
			System.out.println();
		}
	}
}


