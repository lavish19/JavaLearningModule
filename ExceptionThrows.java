//program to illustrate Exception thrown explicitly
class ExceptionThrows extends Exception{
	public ExceptionThrows(String Msg) {
		super(Msg);
	}
}
class EmployeeTest{
	static void employeeAge(int age) throws ExceptionThrows{
		
			if(age<0) {
				throw new ExceptionThrows("Age can't be less than zero");
			}
			else
				System.out.println("input is valid");
	}
	public static void main(String[] args) {
		try {
			employeeAge(-2);
			
		}
		catch(ExceptionThrows e){
			e.printStackTrace();
		}
	}
}