First we created a folder named Rental_system in which we created four files,named Vehicle,Car,Motorcycle and last Main.
the files are in order so the first that is needed to be constructed is the Vehicle.java file also known as the parent class.

In the vehicle file we created a class named vehicle in which we added four private atributes named,
intiger vehicleId,string brand,string model,double rentalpriceperday,these are the atributes that we will use un all of the other classes.
After we created the four atributes we create a contstrutor in which the costructor will take all the atributes and assing them to the class usin this. function.
Then we created a getter and setter for each one of the atributes.(getters and setters are public methods used to protect and manage access to a class's private variables)
After the getter and setter step is done we  have a method setrentalpriceperday(here we add the price of the vehicle that is for rent per day) and also a method
for checking price in which we add an if else function for checking the price if it is expensive or not,in this case if the price is above 70$ 
The system at the end will tell us that the vehicle is expensive is it is not above 70$ it will tell us that the vehicle is affordable.
Then we have the final method name display info.This will display what we tell the system to display such as vehicleId,brand,etc. using system.out.println("").

Now that the parent class is created,we need to have a child class in which we will take the atributes form the parent class using class _____ extends Vehicle.
In this case the child class is named car,appart from the attributes from the vehicle class we add also two more attributes named intiger numberofdoors and string fueltype
these atributes are also private which means that these two atributes are only for this class.
When we created the parent class we also made the atributes private but for us to use them in this class too we will use super(the names of the atributes form the parent class)
to use them in this class too.
The two new atributes will also be needed to be assinged to the child class,thats why will use the this. function to assing them.
After they are assigned we will create a getter and a setter for both of the atributes.
Now for us to be able to read both the parents class and childs class outputs,we will first use 
the @override function.(what this function does?it lets us  the parent's displayInfo()  with the version in the child class)
we will also use the super function here so that the system will firstly display the atributes of the parents class and then will add the 
two atributes that we created in this class using system.out.println("").

Now we have a parent class and a child class.
We will need another child class named Motorcycle.This atribute will be used for adding other attributes appart from the car attribute but also using the parents class atributes.
Here we will also use the extends function that will look like class Motorcycle extends Vehicle.
In this class we will also create two more private atributes named int enginecapacity and boolean hashelmet that will be assigned only to this class.
Here we will also use the super function to call the atributes from the parent(vehicle) class.
Then we create getters and setters for the two atributes.
After that comes the @override function that works eexatly like the other childs class but here it will be used to print the atributes from this class and the parent class.

Now we are left with one parent class and two child classes.By the way we have constructed these until now we cannot exatly run them individualy because until now they 
were not constructed to work together.That is where the main class comes in handy.
All that we have done until now will be put together in the main class so that the project will work flawlessly.
We first import the Scanner so the system can read what the user types on the keyboard. 
Once the user gives us that number, we create an array named vehicles[] that will hold all of our Vehicle objects based on that exact number.
After we created the array,we will create a for loop that will run for as many times as we will input the number for the vehicles.
Inside this loop,using system.out.println("") we ask the user to choose between a car and a motorcyle.We also add a if statement that says if 
the number that the user inputed is not equal to one of the chooices,the system should print invalid choice.
Then the system will ask the user what is the vehicles id ,the brand, the model,and using the help of scanner we will be able add all of them one by one.
We also add a function to add the price for each car about what will it cost to rent the car for a day.if the price is negative,it will print
rental price cannot be negative.
These functions are all created usind do while statement.The way this works is that the system wil first run the code then it will see 
if the conditions are met.In this case how that worked is that the system asked first to put the price, the price was negative and outputed the 
system.out.then the system will see again if the statement is true.in this case while(price<0),the statement is true and the system will go again 
to the do function,it will ask us again and again and again until the condtion is met,in this case the price should be bigger that 0.
When the condition is met only then it will continue to the next step.
The next step is how many days do we want to rent the car.We first ask the user for how many days they will want to rent the car,
then using scanner we insert the days,and then we will use again the do-while statement.
This is the same as the price one that we explained just now.The rental days cannot be negative otherwise 
will ask us the same question again and again.     
Now most of the work is almost done.After that the user after he inputed all the cars in the system.He will have the option to choose one vehicle 
based on the vehicles id.If one the ids that are saved in the system match the id that the user searched the system will print all the infos of the car
If the id is not matching with any of the ids in the system,it will print "vehicle not found".
How does the system check this?
Using for loop.This loop is the most important in all of the main file.Using the for loop,the array that we created to store our vehicles,are all 
declared with a number,going from 0-as many cars as we insrted.now when the id that we inserted in the system will be presented to the loop,
the loop will continue to search for the same id in the arrays stored in the main file until it will find it.if it finds it it will print
the infos of the car,if not it will print "vehicle not found"
 