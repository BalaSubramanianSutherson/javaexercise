package designpattern.structual.composite;

public class Company {
	int a = 0;
	Company() {
		int a = 9;
	}
			
	public static void main(String[] args) {
	
		Accounts accounts = new Accounts(1, "abul");
		Accounts accounts2 = new Accounts(2, "kasim");
		
		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(accounts);
		directory.addEmployee(accounts2);
		
		Manager manager = new Manager(3,"Syed");
		Manager manager2 = new Manager(4,"Rehman");
		
		CompanyDirectory directory2 = new CompanyDirectory();
		directory2.addEmployee(manager);
		directory2.addEmployee(manager2);
		
		CompanyDirectory directories = new CompanyDirectory();
		directories.addEmployee(directory);
		directories.addEmployee(directory2);
		
		
		directories.showDetails();
		
	}

}
