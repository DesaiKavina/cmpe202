public class PersonalTaxPenaltyStrategy implements IStrategy {

	public PersonalTaxPenaltyStrategy() 
	{ 
	}

	@Override
	public double calculateTax(double income) 
	{

		System.out.println("\n---------------- Personal Tax With Penalty ------------------");
		double tax = income * 0.4;
		return tax;
	}
}