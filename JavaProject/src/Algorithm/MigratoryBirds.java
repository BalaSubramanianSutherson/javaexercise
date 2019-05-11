package Algorithm;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MigratoryBirds {
	// Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    	
    	int[] result = new int[Collections.max(arr)];
    	
    	for(int i  = 0; i<arr.size(); i++) {
    		result[arr.get(i) -1] =  result[arr.get(i)-1] +1 ;
    	}
    	
    	int max = 0, index = 0;
    	for(int i = 0; i< result.length ; i++) {
    		if(max<result[i] && i != index) {
    			max = result[i];
    			index = i;
    		}
    	}
		return index+1;


    }

    public static void main(String[] args) throws IOException {
    	
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
