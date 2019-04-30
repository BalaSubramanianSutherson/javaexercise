package ProblemSolving;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {
	
	 // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboardByMe(int[] scores, int[] alice) {
    	
    	
    	int[] result = new int[alice.length];
    	List<Integer> list  = Arrays.stream(scores).distinct().boxed().collect(Collectors.toList());
//    	list.stream().distinct();
    	Collections.sort(list,Collections.reverseOrder());
    	System.out.println(list);
    	for(int i = 0; i < alice.length; i++) {
    		for(int j = 0; j < list.size(); j++) {
    			if(alice[i] >= list.get(j) ) {
    				result[i]= j+1;
    				break;
    			}else if( j == list.size()-1){
    				result[i] = list.size()+1;
    			}
    		}
    	}
    	return result;
    }
    
    private static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] rankings = new int[scores.length];
        int minScore = Integer.MAX_VALUE;
        int rank = 0;
        for (int si = 0; si < scores.length; si++) {
            if (scores[si] < minScore) {
                minScore = scores[si];
                rank++;
            }
            rankings[si] = rank;
        }
        rank++;
        System.out.println("rank "+rank +"- "+rankings.length);
        
        for (int i = 0; i < rankings.length; i++) {
        	   System.out.println(" rankings "+rankings[i]);
          }
     
        int[] aliceRanks = new int[alice.length];
        Arrays.fill(aliceRanks, rankings[rankings.length - 1] + 1);
        System.out.println("aliceRanks "+aliceRanks[aliceRanks.length-1]);
        for (int i = 0, j = scores.length - 1; i < alice.length; i++) {
            for (; j > -1; j--) {
                if (scores[j] > alice[i]) break;
                rank = rankings[j];
            }
            aliceRanks[i] = rank;
        }
        return aliceRanks;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
          System.out.println(i+")"+result[i]);
        }

       
        scanner.close();
    }

}
