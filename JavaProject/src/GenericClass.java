import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericClass <T>{
	
	GenericClass(T obj){
		System.out.println(obj.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2);
		new GenericClass<>(list);
		
		Set set = new HashSet<Integer>(Arrays.asList(3,4));
		new GenericClass<>(set);
	}

}
