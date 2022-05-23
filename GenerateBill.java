import java.io.*;
abstract class Plan{
	protected double rate;
	abstract void getRate();
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}
}
class DomesticPlan extends Plan{
	public void getRate() {
		rate=3.50;
	}
	
}
class CommercialPlan extends Plan{
	public void getRate() {
		rate=7.50;
	}
}
class InstitutionalPlan extends Plan{
	public void getRate() {
		rate=5.50;
	}
}
class GetPlanFactory{
	public Plan getPlan(String planType) {
		if(planType==null) {
			return null;
		}
		 if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		 else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			 return new CommercialPlan();
		 }
		 else if(planType.equalsIgnoreCase("INSTITUTIONPLAN ")) {
			 return new InstitutionalPlan();
		 }
		
		return null;
	}
}
public class GenerateBill {
	public static void main(String[] args)throws IOException {
		GetPlanFactory planFactory=new GetPlanFactory();
		System.out.println("enter the name of the plan for which bill will be generated");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String planName=br.readLine();
		System.out.println("enter the number of units for which bill be generated");
		int units=Integer.parseInt(br.readLine());
		Plan p=planFactory.getPlan(planName);
		System.out.println("bill amount for the	"+planName+"of"+units+"units is: ");
		p.getRate();
		p.calculateBill(units);
	}

}
