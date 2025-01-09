package zad2;

public class Test {
    public static void  main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("BMW", "X5", "Black", 300, "Petrol", "Automatic", 2020);
        cars[1] = new Car("Audi", "A6", "White", 250, "Diesel", "Manual", 2019);
        cars[2] = new Car("Mercedes", "S500", "Silver", 350, "Petrol", "Automatic", 2021);
        cars[3] = new Car("Audi", "A3", "Red", 200, "Diesel", "Manual", 2018);

        Car[] filteredCars = Car.filterByBrand(cars, 'A');
        for (Car car : filteredCars) {
            System.out.println(car.getBrand());
        }

        Car[] sortedCars = Car.sortByBrand(cars, false);
        for (Car car : sortedCars) {
            System.out.println(car.getBrand());
        }

        Car[] uniqueCars = Car.removeDuplicates(cars);
        for (Car car : uniqueCars) {
            System.out.println(car.getBrand());
        }
    }
}
