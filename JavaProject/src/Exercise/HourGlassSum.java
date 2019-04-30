package Exercise;

public class HourGlassSum {
	
	public static void main(String[] args) {
		int arr[][] = {
				{-9, 1, 1, 0, 0, 0	},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0},
		};
		int size = arr.length, sum = -1000;
		for(int i = 0; i<size-2; i++) {
			for(int j = 0; j<size-2; j++) {
				
				int tot =  arr[i][j] + arr[i][j+1] + arr[i][j+2] 
							+ arr[i+1][j+1]+
							arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				
				if(sum<tot)
					sum = tot;
			}
		}
		
		System.out.println(sum);
	}

}
