
public class Arraycheck {
public static void main(String[] args) {
	
	boolean flag = true;
	for(int i=0; i<5; i++ ) {
		if(flag) {
			for(int j= 0; j<3; j++) {
				if(i<3) {
				 flag = true;
					break;
				}{
					flag = false;
				}
				
				System.out.println(i+"--"+j);
			}
		}
	}
}
}
