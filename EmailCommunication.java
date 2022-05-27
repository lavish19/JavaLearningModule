
public class EmailCommunication implements Communication{

	@Override
	public void process(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println( emp.Name+" communicated via email "+emp.Email);
	}

}
