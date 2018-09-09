public class GumballMachine
{

    private int num_gumballs1;
    private int num_gumballs2;
    private int num_gumballs3;
    private boolean has_quarter;
    private boolean has_quarters;
    private boolean has_coins;
    private int model;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs1 = size;
        this.num_gumballs2 = size;
        this.num_gumballs3 = size;
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
            System.out.println("Invalid input coin, please enter exactly two quarters only");
        }
    }
    
    // method for model 3
    public void insertCoins(int input[])
    {
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
            {
                this.has_coins = false;
                System.out.println("Not proper ampount, it should be exactly 50 cents.");
            }
        }
    }
    
    //method for turning crank after inserting the coin
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs1 > 0 )
            {
                this.num_gumballs1-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs in machine1. Sorry, can't return your quarter." ) ;
                this.has_quarter = false;
            }
        }       
        else if ( this.has_quarters )
        {
            if ( this.num_gumballs2 > 0 )
            {
                this.num_gumballs2-- ;
                this.has_quarters = false ;
                System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs in machine2. Sorry, can't return your quarters." ) ;
                this.has_quarters = false;
            }
        } 
        else if ( this.has_coins )
        {
            if ( this.num_gumballs3 > 0 )
            {
                this.num_gumballs3-- ;
                this.has_coins = false ;
                System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs in machine3. Sorry, can't return your coins." ) ;
                this.has_coins = false;
            }
        }
        else 
        {
            System.out.println( "Please insert proper coins first") ;
        }   
    }
}