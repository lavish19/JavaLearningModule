package sychronization;

 class Customer{
	int amount=10000;
synchronized void withdraw(int amount) {
	System.out.println("going to withdraw");
	if(this.amount<amount) {
		System.out.println("less balance ,waiting for the deposit");
		try {
			wait();
		}catch(Exception e) {
			System.out.println("exception occured"+e);
		}
		this.amount-=amount;
		System.out.println("withdraw completed");
	}
}
synchronized void deposit(int amount) {
	System.out.println("going to deposit");
	this.amount+=amount;
	System.out.println("deposit completed");
	notify();
}
}
 class Inter_comm{
	 public static void main(String[] args) {
		 Customer c=new Customer();
		 new Thread() {
		 public void run() {
			 c.withdraw(15000);}
		 }.start();
	 new Thread() {
		 public void run() {
			 c.deposit(10000);}
	 }.start();
	 System.out.println(c.amount);
	 }
 }
