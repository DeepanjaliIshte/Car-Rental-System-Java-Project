# Car-Rental-System-Java-Project

<h4>Car Class: </h4>

Attributes:
carId: Unique identifier for the car.
brand: The brand of the car (e.g., Toyota, Honda).
model: The model of the car (e.g., Camry, Civic).
basePricePerDay: The rental price per day.
isAvailable: Indicates if the car is available for rent.

Methods:
getCarId(), getBrand(), getModel(): Getters for the car attributes.
calculatePrice(int rentalDays): Calculates the total rental price for a given number of days.
isAvailable(): Checks if the car is available.
rent(): Marks the car as rented.
returnCar(): Marks the car as available.

<h3>Customer Class:</h3>

Attributes:
customerId: Unique identifier for the customer.
name: The name of the customer.
Methods:
getCustomerId(), getName(): Getters for the customer attributes.
Rental Class:

Attributes:
car: The car being rented.
customer: The customer renting the car.
days: The number of days the car is rented.

Methods:
getCar(), getCustomer(), getDays(): Getters for the rental attributes.
CarRentalSystem Class:

<h3>CarRentalSystem Class</h3?
This class manages the car rental system operations, including adding cars, renting cars, and returning cars.

Attributes:
cars: List of available cars.
customers: List of customers.
rentals: List of current rentals.

Methods:
addCar(Car car): Adds a new car to the system.
addCustomer(Customer customer): Adds a new customer to the system.
rentCar(Car car, Customer customer, int days): Processes the car rental.
returnCar(Car car): Processes the car return.
displayAvailableCars(): Displays the list of available cars.
menu(): Main menu for interacting with the car rental system.
rentCarMenu(Scanner scanner): Handles the process of renting a car.
returnCarMenu(Scanner scanner): Handles the process of returning a car.
Main Program Flow

Initialization:
The CarRentalSystem is initialized, and a few cars are added to the system in the main method.

Menu Loop:
The menu method presents the main menu with three options: rent a car, return a car, or exit.
Based on user input, it calls the appropriate method to handle renting or returning a car.

Renting a Car:

The rentCarMenu method:
Prompts the user for their name.
Displays a list of available cars.
Prompts the user to select a car by its ID and enter the number of rental days.
Validates the car selection and calculates the total price.
Confirms the rental with the user.
If confirmed, the car is marked as rented, and the rental information is recorded.
Returning a Car:

The returnCarMenu method:
Prompts the user to enter the car ID they wish to return.
Validates the car ID and checks if the car is currently rented.
Marks the car as available and removes the rental record.
Confirms the return to the user.

Detailed Explanation of Method

Car Class Methods:
calculatePrice(int rentalDays): Multiplies the base price per day by the number of rental days to get the total rental cost.
isAvailable(), rent(), returnCar(): Manage the availability status of the car.

CarRentalSystem Class Methods:
addCar(Car car), addCustomer(Customer customer): Add new cars and customers to their respective lists.
rentCar(Car car, Customer customer, int days): Checks if the car is available, marks it as rented, and adds a new rental record.
returnCar(Car car): Marks the car as available and removes the corresponding rental record.
displayAvailableCars(): Iterates through the list of cars and prints out the details of cars that are available.
menu(): Provides an interactive menu for the user, allowing them to choose between renting a car, returning a car, or exiting the system.
rentCarMenu(Scanner scanner): Handles the user input and logic for renting a car.
returnCarMenu(Scanner scanner): Handles the user input and logic for returning a car.
This structured approach makes the system easy to understand, maintain, and extend with additional features if necessary. The refactoring and enhancements improve user experience and system robustness.
