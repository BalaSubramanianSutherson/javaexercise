package designpattern.structual.composite;

public class Manager implements Employee  {

	private int empId;
	
	private String name;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	@Override
	public void showDetails() {
		System.out.println("emp: "+ empId +"--"+name);
	}

}
