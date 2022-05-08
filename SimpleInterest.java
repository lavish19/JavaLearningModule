
 class Details {
	int principal;
	float rateOfInterest;
	int time;
	
	public int principal(int p) {
		this.principal=p;
		return p;
	}
	public float rateOfInterest(float r	) {
		this.rateOfInterest=r;
		return r;
	}
	public int time(int t) {
		this.time=t;
		return t;
	}
	public void display() {
		System.out.println("entered details are");
		System.out.println("principal - "+principal+" rate of interest - "+rateOfInterest+" time - "+time);
	
	}
	public double result() {
		double result=(principal*rateOfInterest*time)/100;
		return result;
	}
	}


class SimpleInterest{
	public static void main(String[] args) {
		Details d=new Details();
		
		d.principal(1000);
		d.rateOfInterest(7.25f);
		d.time(2);
		d.display();
		System.out.println("calculated simple interest is ");
		System.out.println(d.result());
		
		
	}
	
}
