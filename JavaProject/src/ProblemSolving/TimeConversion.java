package ProblemSolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
	


    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        
        String noon =  s.substring(s.length()-2, s.length());
           if("PM".equals(noon)) {
              int i = Integer.parseInt(s.substring(0, 2));
               if(i<12){
               i = i+12 ;
               return String.valueOf(i)+s.substring(2,  s.length()-2);
               }
               return s.substring(0,  s.length()-2);
           }else {
               if(Integer.parseInt(s.substring(0, 2)) ==12) {
                   return "00"+s.substring(2,  s.length()-2);
               }else {
                   return s.substring(0,  s.length()-2);
               }
               
           }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);
System.out.println(result);
    }

}
