
public class CNDecorator implements IPrintDecorator {

	/**
	 * Print method for decorating and adding spaces
	 */
	public String print(String num) {
		StringBuilder number = new StringBuilder();
		for(int i=0;i<num.length();i++) {
			if(i==12 || i==8 || i==4)
				number.append(" " + num.charAt(i));
			else
				number.append(num.charAt(i));
		}
		return number.toString();
	}

}
