## Observer Design pattern

- Without lambda (original implementation of Observer pattern)

The original implementation of the Observer design pattern contains two interface : Observer and Subject. There are three observer classes which implements the interface Observer : AnxiousObsever, OptimisticObserver, PatientObserver. There is one class School which implements Subject interface. The class School maintains an arraylist for attaching the observers to the subject. 

- With lambda (functional programming)

In the lambda implementation, there are no separate observer classes which implement the Observer interface. Instead, additional behavior is specified for the subject class (School) in that class itself. Thus there only remains two interfaces : Observer and Subject, and one Java class School.

- **Comparison**

In the lambda way of writing the code for the observer pattern, concrete implementation of the observers has been passed as behavior inside the subject class, which made the code more concise and readable. The use of Lambda function simply removes the boilerplate. So there is no need for separate instantiation of three observer classes. 


## Strategy Design pattern

- Without lambda (original implementation of Strategy pattern)

The original implementation of strategy pattern includes one interface Istrategy which has the method calculateTax(). There are three different strategies for calculating the Income tax : PersonalTax, PersonalTaxWithPenalty and PersonalTaxWithRebate. There is another client class TaxStrategyMain where all the three strategy classes are instantiated and their calculateTax() method is called one by one.

- With lambda (functional programming)

In the lambda way of implementation of Stategy pattern, there is no need to create three separate Java classes for three different strategies. Instead, using lambda function, different implementations of the strategies are made in the client class itself. Thus the new code now has only one interface IStrategy and one Java class TaxStrategyMain where lambda function is used for implementation of three different kinds of strategies.

- **Comparison**

Using lambda function for this design pattern, the code becomes quite concise. Thus, the code can be refactored to remove the boilerplate and the implementation becomes less verbose.
