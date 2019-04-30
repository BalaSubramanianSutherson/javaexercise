
public class SubSet {
	
	
	public static void main(String[] args) 
    { 
        char set[] = {'a', 'b', 'c'}; 
        printSubsets(set); 
    }
	
	public void display() {
		System.out.println("From java sample");
	}

	private static void printSubsets(char[] set) {
		// TODO Auto-generated method stub
		int n = set.length;
		for(int i = 0; i<(1<<n); i++) {
			 System.out.print("{ "); 
			for(int j=0; j<n; j++) {
				if((i&(1<<j))>0) {
					System.out.print(set[j] + " "); 
				}
			}
			 System.out.println("}"); 
		}
	} 	

}
