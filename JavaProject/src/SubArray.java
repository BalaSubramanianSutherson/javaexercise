import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArray {

	static int count(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length()-1; i++) {
			for (int j = i+1; j < str.length(); j++) {
				if(ch[i] == ch[j]) {
					return 0;
				}
			}
		}
		return str.length();
	}
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		String name=in.next();
//		System.out.println(name.substring(3, 7));
		StringBuffer buffer = new StringBuffer(name);
		String temp = String.valueOf(buffer.reverse());
		if(name.equals(temp) ){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}*/
		
		Singleton.Instance.doSomething();
		Scanner in = new Scanner(System.in);
		String name=in.next();
		int max =1;
		max = count(name);
		if(max == name.length()) {
			System.out.println(max);
			return;
		}
		for(int i=2; i<name.length(); i++) {	
			int k =i;
			for(int j=0; j<name.length(); j++ ) { 
				if(k<=name.length()) {
					/*System.out.println(name.substring(j, k));*/
					int c =  count(name.substring(j, k));
					max = max< c?c:max;
					k++;
				}else {
					break;
				}
			
			}
		}
		System.out.println(max);
		 
		
		
	}

}
