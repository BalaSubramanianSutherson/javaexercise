package ProblemSolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GridSearch {
	 // Complete the gridSearch function below.
    static String gridSearch(String[] G, String[] P) {
        boolean flag = true;
        int j = 0, i=0;
        int index = 0;
    	for(; i< P.length; i++){
    		if(flag) {
    			for(; j< G.length; j++) {
        			if(G[j].contains(P[i]) ){
        				if(i!=0) {
        					if(index == G[j].indexOf(P[i])) {
        						flag =  true;
        					}else {
        						flag = false;
        					}
        				}else {
        					index = G[j].indexOf(P[i]);
        					flag =  true;
        				}
        				break;
        			}else {
        				if(i!=0) {
        					flag = false;
        				}
        				
        				
        			}
        		}
    		}
        }
        return flag?"YES":"NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);
            System.out.println(result);
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
