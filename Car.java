package in.System;
	
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private String carId;	//Unique identifier for the car.
    private String brand;	// Brand of the car (e.g., Toyota, Honda).
    private String model;	//Model of the car (e.g., Camry, Civic).
    private double basePricePerDay;	//  Rental price per day.
    private boolean isAvailable; // Indicates if the car is available for rent.

    public Car(String carId, String brand, String model, double basePricePerDay) {
        this.carId = carId;	 
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }
    
    // getCarId(), getBrand(), getModel(): Getter methods for car attributes.
    public String getCarId() 
    {
        return carId;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public double calculatePrice(int rentalDays) //  Calculates total rental price based on the number of days.
    
     {
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailable() // Checks if the car is available for rent.
    {
        return isAvailable;
    }

    public void rent() // Marks the car as rented.
    {
        isAvailable = false;	
    }

    public void returnCar() //Marks the car as available.
    {
        isAvailable = true;
    }
}

class Customer 
	{
    private String customerId;	//Unique identifier for the customer.
    private String name;	// Name of the customer.


    public Customer(String customerId, String name) 
    {
        this.customerId = customerId;
        this.name = name;
        /*
         he constructor takes two parameters (customerId and name) 
         and assigns them to the instance variables (this.customerId and this.name).
         */
    }
    
    // getCustomerId(), getName(): Getter methods for customer attributes.
    public String getCustomerId() 
    {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

class Rental {
	
    private Car car; //The car being rented.
    private Customer customer;	//The customer renting the car.
    private int days;	// The number of days the car is rented.

    public Rental(Car car, Customer customer, int days)
    {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }
    // getCar(), getCustomer(), getDays(): Getter methods for rental attributes.
    public Car getCar() 
    {
        return car;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public int getDays()
    {
        return days;
    }
}

class CarRentalSystem
{
    private List<Car> cars;	//List of available cars.
    private List<Customer> customers;	// List of customers.
    private List<Rental> rentals;	// List of current rentals.


    public CarRentalSystem() 
    // The CarRentalSystem is initialized, and a few cars can be added to the system if needed.
    {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    
    public void addCar(Car car) 	//Adds a new car to the system.
    {
        cars.add(car);
    }

    public void addCustomer(Customer customer) 	//Adds a new customer to the system.
    {
        customers.add(customer);
    }

    public void rentCar(Car car, Customer customer, int days)	// Processes the car rental.
    {
        if (car.isAvailable()) {
            car.rent();
            rentals.add(new Rental(car, customer, days));

        } else 
        {
            System.out.println("Car is not available for rent.");
        }
    }

    public void returnCar(Car car)	//Processes the car return
    {
        car.returnCar();
        Rental rentalToRemove = null;
        for (Rental rental : rentals) 
        {
            if (rental.getCar() == car) 
            {
                rentalToRemove = rental;
                break;
            }
        }
        if (rentalToRemove != null)
        {
            rentals.remove(rentalToRemove);

        } else 
        {
            System.out.println("Car was not rented.");
        }
    }

    public void menu() 
    // Displays the main menu and handles user input for renting or returning a car.
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("===== Car Rental System =====");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) 
            {
                System.out.println("\n== Rent a Car ==\n");
                System.out.print("Enter your name: ");
                String customerName = scanner.nextLine();

                System.out.println("\nAvailable Cars:");
                for (Car car : cars) 
                {
                    if (car.isAvailable()) 
                    {
                        System.out.println(car.getCarId() + " - " + car.getBrand() + " " + car.getModel());
                    }
                }

                System.out.print("\nEnter the car ID you want to rent: ");
                String carId = scanner.nextLine();

                System.out.print("Enter the number of days for rental: ");
                int rentalDays = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                Customer newCustomer = new Customer("CUS" + (customers.size() + 1), customerName);
                addCustomer(newCustomer);

                Car selectedCar = null;
                for (Car car : cars) 
                {
                    if (car.getCarId().equals(carId) && car.isAvailable())
                    {
                        selectedCar = car;
                        break;
                    }
                }

                if (selectedCar != null)
                {
                    double totalPrice = selectedCar.calculatePrice(rentalDays);
                    System.out.println("\n== Rental Information ==\n");
                    System.out.println("Customer ID: " + newCustomer.getCustomerId());
                    System.out.println("Customer Name: " + newCustomer.getName());
                    System.out.println("Car: " + selectedCar.getBrand() + " " + selectedCar.getModel());
                    System.out.println("Rental Days: " + rentalDays);
                    System.out.printf("Total Price: $%.2f%n", totalPrice);

                    System.out.print("\nConfirm rental (Y/N): ");
                    String confirm = scanner.nextLine();

                    if (confirm.equalsIgnoreCase("Y"))
                    {
                        rentCar(selectedCar, newCustomer, rentalDays);
                        System.out.println("\nCar rented successfully.");
                    } 
                    else 
                    {
                        System.out.println("\nRental canceled.");
                    }
                } 
                else 
                {
                    System.out.println("\nInvalid car selection or car not available for rent.");
                }
            } 
            else if (choice == 2) 
            {
                System.out.println("\n== Return a Car ==\n");
                System.out.print("Enter the car ID you want to return: ");
                String carId = scanner.nextLine();

                Car carToReturn = null;
                for (Car car : cars) {
                    if (car.getCarId().equals(carId) && !car.isAvailable()) {
                        carToReturn = car;
                        break;
                    }
                }

                if (carToReturn != null) 
                {
                    Customer customer = null;
                    for (Rental rental : rentals)
                    {
                        if (rental.getCar() == carToReturn) 
                        {
                            customer = rental.getCustomer();
                            break;
                        }
                    }

                    if (customer != null) 
                    {
                        returnCar(carToReturn);
                        System.out.println("Car returned successfully by " + customer.getName());
                    } 
                    else
                    {
                        System.out.println("Car was not rented or rental information is missing.");
                    }
                } 
                else 
                {
                    System.out.println("Invalid car ID or car is not rented.");
                }
            } 
            else if (choice == 3) 
            {
                break;
            } else 
            {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        System.out.println("\n Thank you for using the Car Rental System!");
    }

}
