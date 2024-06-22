package in.System;

public class Main{
    public static void main(String[] args) {
    	// A new instance of the CarRentalSystem class is created. This object will manage cars, customers, and rentals.
        CarRentalSystem rentalSystem = new CarRentalSystem();

        //Three new Car objects are created with unique IDs, brands, models, and base prices per day.
        Car car1 = new Car("C001", "Toyota", "Camry", 60.0); // Different base price per day for each car
        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);
        
        //The created Car objects are added to the CarRentalSystem using the addCar method.
        //This method adds each car to the internal list of available cars.
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        //This method displays the main menu and handles user interactions such as renting and returning cars.
        rentalSystem.menu();
    }
}