package Exercise;

import java.util.Scanner;

public class MinimumBribes {
	


    // Complete the minimumBribes function below. 
	//2 1 5 3 4
	

//	1 2 5 3 7 8 6 4
//	output 4 
	    static void minimumBribes(int[] q) {
	    	int sum = 0, count = 1;
	    	for(int i = 0; i<q.length; i++) {
	    		int pos = q[i];
	    		if(q[i] != i) {
	    			if(pos > i)
	    				sum = pos - i;
	    			else
	    				sum = i - pos;
	    			count++;
	    		}
	    		if(sum>3) {
	    			System.out.println("Too chaotic");
	    			return;
	    		}
	    	}
	    	System.out.println(count);
	    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }

}
