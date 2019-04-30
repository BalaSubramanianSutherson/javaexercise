package designpattern.structual.composite;

public class Accounts implements Employee  {

	private int empId;
	
	private String name;
	
	public Accounts() {
		// TODO Auto-generated constructor stub
	}
	public Accounts(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	@Override
	public void showDetails() {
		System.out.println("emp: "+ empId +"--"+name);
	}

}
