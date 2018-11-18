public class PersonalTaxStrategy implements IStrategy {

	public PersonalTaxStrategy() { 
	   }

	@Override
	public double calculateTax(double income) 
	{
        	System.out.println("-------------- Personal Tax --------------- ");
        	double tax = income * 0.3;
        	return tax;
	}
}