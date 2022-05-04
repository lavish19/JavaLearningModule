class Th1{
	String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
		
	}
	public static void main(String[] args) {
		Th1 t=new Th1();
		t.setName("tuyo");
		System.out.println("name is "+t.getName());
	}
}