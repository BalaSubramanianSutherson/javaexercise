
public class ArrayExercise {

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 },
					  { 0, 0, 1 }, 
					  { 0, 0, 1 } };
		int size = a.length;
		System.out.println(size);
		
		for (int i = 0; i < size;) {
			for (int j = i; j < size;) {
				if ((i < size - 1)) {
					if (a[i + 1][j + 1] == 1) {
						System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
						i++;
						j++;
					} else if (a[i][j + 1] == 1) {
						System.out.println("(" + (i) + "," + (j + 1) + ")");
						j++;
					} else if (a[i + 1][j] == 1) {
						System.out.println("(" + (i + 1) + "," + j + ")");
						i++;
					} else {
						break;
					}
					continue;
				}
				if ((i == size - 1) && (j == size - 1) && a[i][j] == 1) {
					System.out.println("its end "); i=3;
					break;
				}
			}
		}
	}

}
