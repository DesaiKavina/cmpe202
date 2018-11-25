## Summary and comparison

In Lab1, the task was to make modifications to the existing gumball machine code so that it would support two more models of gumball machine. We were supposed to write a universal code that would work for all three kinds of models of the gumball machine. To make this modification, I had to make three separate methods of inserting coins and based on the model type selected, those methods were called. Thus, this kind of solution was not the efficient way of implementations. So, for future requirements if there is a need for adding three more models of the gumball machine then, I would have had to add three more methods for taking coins from the user.


On the other hand, by using Feature IDE AsectJ, the varieties of the models of the gumball machine are handled in the config file itself. This supports the concept of ‘separation of concerns’. This type of implementation remains open for change as it becomes very easy to just add a feature when a new requirement arises. As a result, the code becomes easy and less complex. So, one can select for the type of model one wants in the feature model configuration before running the code, and so the output is displayed as per the requirement.  


## Screenshots 

(1) Crank model – 25 cents

![alt text]( https://github.com/DesaiKavina/cmpe202/blob/master/lab10/screenshots/CrankModel_25Cents.png)


(2) Crank model – 50 cents

![alt text]( https://github.com/DesaiKavina/cmpe202/blob/master/lab10/screenshots/CrankModel_50Cents.png)


(3) Slot model – 50 cents

![alt text]( https://github.com/DesaiKavina/cmpe202/blob/master/lab10/screenshots/SlotModel_50Cents.png)


