package designpattern.structual.composite;
import java.util.ArrayList; 
import java.util.List; 
  
public class CompanyDirectory implements Employee 
{ 
    private List<Employee> employeeList = new ArrayList<Employee>(); 
       
    public void addEmployee(Employee emp) 
    { 
        employeeList.add(emp); 
    } 
       
    public void removeEmployee(Employee emp) 
    { 
        employeeList.remove(emp); 
    }

	@Override
	public void showDetails() {
		for(Employee emp:employeeList) 
        { 
            emp.showDetails(); 
        } 
	} 
} 