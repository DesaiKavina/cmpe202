import java.util.Arrays;
import java.util.List;

public class TaxStrategyMain {

	public static void main(String [] args) {

		List<IStrategy> taxStrategyList = Arrays.asList(
		      (income) -> {
		          System.out.println("--------------- Personal Tax --------------- ");
                    	  double tax = income * 0.3;
                    	  return tax;
		      },
		      (income) -> {
		          System.out.println("--------------- Personal Tax With Penalty--------------- ");
                    	  double tax = income * 0.4;
                    	  return tax;
		      },
		      (income) -> {
		          System.out.println("--------------- Personal Tax With Rebate --------------- ");
                    	  double tax = income * 0.2;
                    	  return tax;
		      }
		);

		for (IStrategy taxStrategy : taxStrategyList) {
			System.out.println(taxStrategy.calculateTax(30000.0));
		}
	}
}