# Car-Rental-System-Java-Project
(Using OOP's Concept)
<h6>
 Designing a Car Rental System using OOP principles.
 Implementing classes, methods, and encapsulation for organized code. Applying inheritance and 
 polymorphism to create a versatile car inventory.
 Crafting a user-friendly console interface for renting and returning cars.
 Calculating rental prices based on different car types and durations.
 Efficiently managing customers, cars, and rentals in the system.
</h6>
<h3>Car Class: </h3>

<h6>
Attributes: <br>
carId: Unique identifier for the car. <br>
brand: The brand of the car (e.g., Toyota, Honda). <br>
model: The model of the car (e.g., Camry, Civic). <br>
basePricePerDay: The rental price per day. <br>
isAvailable: Indicates if the car is available for rent. <br>

Methods: <br>
getCarId(), getBrand(), getModel(): Getters for the car attributes. <br>
calculatePrice(int rentalDays): Calculates the total rental price for a given number of days. <br>
isAvailable(): Checks if the car is available. <br>
rent(): Marks the car as rented. <br>
returnCar(): Marks the car as available. <br>
</h6>

<h3>Customer Class:</h3>
<h6>
Attributes: <br>
customerId: Unique identifier for the customer. <br>
name: The name of the customer. <br>
   <br>
Methods: <br>
getCustomerId(), getName(): Getters for the customer attributes. <br>
</h6>

<h3>Rental Class: </h3>
<h6>
Attributes: <br>
car: The car being rented. <br>
customer: The customer renting the car. <br>
days: The number of days the car is rented. <br>

Methods: <br>
getCar(), getCustomer(), getDays(): Getters for the rental attributes.
</h6>

<h3>CarRentalSystem Class</h3>
<h6>
This class manages the car rental system operations, including adding cars, renting cars, and returning cars.

Attributes: <br>
cars: List of available cars.
customers: List of customers.
rentals: List of current rentals.

Methods: <br>
addCar(Car car): Adds a new car to the system. <br>
addCustomer(Customer customer): Adds a new customer to the system. <br>
rentCar(Car car, Customer customer, int days): Processes the car rental. <br>
returnCar(Car car): Processes the car return. <br>
displayAvailableCars(): Displays the list of available cars. <br>
menu(): Main menu for interacting with the car rental system. <br>
rentCarMenu(Scanner scanner): Handles the process of renting a car. <br>
returnCarMenu(Scanner scanner): Handles the process of returning a car. <br>
</h6>
<h4>Main Program Flow</h4>
<h6>
Initialization: <br>
The CarRentalSystem is initialized, and a few cars are added to the system in the main method.

Menu Loop: <br>
The menu method presents the main menu with three options: rent a car, return a car, or exit.
Based on user input, it calls the appropriate method to handle renting or returning a car.

Renting a Car: <br>

The rentCarMenu method: <br>
Prompts the user for their name.
Displays a list of available cars.
Prompts the user to select a car by its ID and enter the number of rental days.
Validates the car selection and calculates the total price.
Confirms the rental with the user.
If confirmed, the car is marked as rented, and the rental information is recorded.
Returning a Car:

The returnCarMenu method: <br>
Prompts the user to enter the car ID they wish to return.
Validates the car ID and checks if the car is currently rented.
Marks the car as available and removes the rental record.
Confirms the return to the user.

Detailed Explanation of Method

Car Class Methods:  <br>
calculatePrice(int rentalDays): Multiplies the base price per day by the number of rental days to get the total rental cost.
isAvailable(), rent(), returnCar(): Manage the availability status of the car.

CarRentalSystem Class Methods:  <br>
addCar(Car car), addCustomer(Customer customer): Add new cars and customers to their respective lists. <br>
rentCar(Car car, Customer customer, int days): Checks if the car is available, marks it as rented, and adds a new rental record. <br>
returnCar(Car car): Marks the car as available and removes the corresponding rental record. <br>
displayAvailableCars(): Iterates through the list of cars and prints out the details of cars that are available. <br>
menu(): Provides an interactive menu for the user, allowing them to choose between renting a car, returning a car, or exiting the system. <br>
rentCarMenu(Scanner scanner): Handles the user input and logic for renting a car. <br>
returnCarMenu(Scanner scanner): Handles the user input and logic for returning a car. <br>

This structured approach makes the system easy to understand, maintain, and extend with additional features if necessary. The refactoring and enhancements improve user experience and system robustness.

</h6>
