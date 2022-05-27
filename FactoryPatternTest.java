import java.util.ArrayList;
import java.util.List;
public class FactoryPatternTest {
public static void main(String [] args) {
	List<Employee> empList=createEmployeeList();
	CommunicationFactory factory=new CommunicationFactory();
	Communication processor;
	for(Employee emp:empList) {
		processor=factory.getProcess(emp.modeOfContact);
		processor.process(emp);
	}
}
private static List<Employee> createEmployeeList(){
	List<Employee> empList=new ArrayList<>();
	Employee e1=new Employee("john cena","1","pune","email","johncena123@gmail.com","1000", 23);
	Employee e2=new Employee("jhon doe","2","surat","mobile","jhondoe12@fmail.com","34342",32);
	Employee e3=new Employee("maya deasai","3","london","email","mayan@gmail.com","435564",34);
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	return empList;
}
}
