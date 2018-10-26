
public class CEDecorator implements IPrintDecorator{

	/**
	 * Print method for decorating and adding slash
	 */
	public String print(String date) {
		StringBuilder datevalue = new StringBuilder();
		for(int i=0;i<date.length();i++) {
			if(i==2)
				datevalue.append("/" + date.charAt(i));
			else
				datevalue.append(date.charAt(i));
		}
		return datevalue.toString();
	}

}
