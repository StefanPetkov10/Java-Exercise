package zad2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int power;
    private String engineType;
    private String gearboxType;
    private int yearOfProduction;


    public Car(String brand, String model, String color, int power, String engineType, String gearboxType, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineType = engineType;
        this.gearboxType = gearboxType;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getGearboxType() {
        return gearboxType;
    }
    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    //2.Създайте метод, който по подаден масив от коли и параметър буква(char), “прочиства” масива от коли и връща нов масив от коли, на които марките им започват с подадената като параметър буква.
    public static Car[] filterByBrand(Car[] cars, char letter) {
        int count = 0;
        for (Car car : cars) {
            if (Character.toLowerCase(car.getBrand().charAt(0)) == Character.toLowerCase(letter)) {
                count++;
            }
        }

        Car[] filteredCars = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getBrand().charAt(0) == letter) {
                filteredCars[index++] = car;
            }
        }
        return filteredCars;
    }

    //3.Създайте втори метод, който по подаден параметър масив от коли, връща отново масив от коли, но сортиран по възходящ или
    // по низходящ ред, в зависимост от марката на колата. Нека редът да се определя от параметър на метода.
    public static Car[] sortByBrand(Car[] cars, boolean ascending) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (ascending) {
                    if (cars[i].getBrand().compareTo(cars[j].getBrand()) > 0) {
                        Car temp = cars[i];
                        cars[i] = cars[j];
                        cars[j] = temp;
                    }
                } else {
                    if (cars[i].getBrand().compareTo(cars[j].getBrand()) < 0) {
                        Car temp = cars[i];
                        cars[i] = cars[j];
                        cars[j] = temp;
                    }
                }
            }
        }
        return cars;
    }

    //4.Създайте трети метод, който по подаден масив от коли проверява дали измежду колите има повтарящи
    // се и връща “прочистен” масив от коли, в който няма повтарящи се коли.
    public static Car[] removeDuplicates(Car[] cars) {
        Set<Car> carSet = new HashSet<>(Arrays.asList(cars));
        Car[] uniqueCar = new Car[carSet.size()];
        int count = 0;

        for(var car: carSet){
            uniqueCar[count] = car;
            count++;
        }

        return uniqueCar;

    }
}

