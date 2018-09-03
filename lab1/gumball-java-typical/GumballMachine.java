public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private boolean has_quarters;
    private boolean has_coins;
    private int model;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.has_quarters = false;
        this.has_coins = false;
        this.model = model;
    }
    public void CheckCase(int model, int input[])
    {
        switch (model)
        {
            case 1: insertQuarter(input);
                    break;
            case 2: insertQuarters(input);
                    break;
            case 3: insertCoins(input);
                    break;
        }
    }
    
    // method for model 1
    public void insertQuarter(int input[])
    {
        if(input.length!=1)
            System.out.println("Invalid input coin!");
        else
        {
            if(input[0] == 25)
                this.has_quarter = true ;
            else
                this.has_quarter = false;
        }
    }
    
    // method for model 2
    public void insertQuarters(int input[])
    {
        if(input[0] == 25 && input[1] == 25 && input.length == 2)
            this.has_quarters = true ;
        else
        {
            this.has_quarters = false;
            System.out.println("Invalid input coin, please enter two quarters only");
        }
    }
    
    // method for model 3
    public void insertCoins(int input[])
    {
        int[] valid_coins = {5,10,25};
        int sum = 0;
        boolean flag = true;
        for(int i=0; i<input.length; i++)
        {
            if(input[i]!=5 && input[i]!=10 && input[i]!=25)
            {
                System.out.println("Invalid input coins!");
                flag = false;
                break;
            }
        }
        if(flag)
        {
            for(int j=0;j<input.length;j++)
            {
                sum += input[j];
            }
            if(sum==50)
                this.has_coins = true;
            else
                this.has_coins = false;
        }
    }
    
    //method for turning crank after inserting the coin
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            //System.out.println( "Please insert a quarter" ) ;
        }        
        if ( this.has_quarters )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarters = false ;
                System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
            }
        }
        else 
        {
            //System.out.println( "Please insert two quarters" ) ;
        }  
        if ( this.has_coins )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_coins = false ;
                System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
            }
        }
        else 
        {
            //System.out.println( "Please insert coins" ) ;
        }        
    }
}