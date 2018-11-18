public class PersonalTaxRebateStrategy implements IStrategy {

	public PersonalTaxRebateStrategy() 
	{ 
	}

	@Override
	public double calculateTax(double income) 
	{
		System.out.println("\n---------------- Personal Tax With Rebate ----------------");
		double tax = income * 0.2;
		return tax;
	}
}