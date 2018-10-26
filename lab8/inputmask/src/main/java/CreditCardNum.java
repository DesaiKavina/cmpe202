/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private IPrintDecorator wrapper = null; 

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
    public void wrapperDecorator(IPrintDecorator w){
    	this.wrapper = w;
    }

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return "[" + wrapper.print(number) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 )
		{
			if( ( ch.equals("X") || ch.equals("x") ) && number.length()>0)
			{
				number = number.substring(0, number.length()-1);
			}
			else
				number += ch ;
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}