package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        int bobSalary = 7361;
        int garySalary = 9476;
        int highestSalary = 0;
        // then code solution
        highestSalary = Math.max(bobSalary,garySalary);
        // then use System.out.println() to display results
        System.out.println(highestSalary);
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The answer is " + highestSalary);
        // REPEAT FOR NEXT EXERCISE

        // Question 2:
        int carPrice = 1022;
        int truckPrice = 8002;
        int cheapestVehicle = 0;
        cheapestVehicle = Math.min(carPrice,truckPrice);
        System.out.println(cheapestVehicle);
        System.out.println("the lowest price is " + cheapestVehicle);

        //Question 3:
        double radius = 7.25;
        System.out.println(Math.PI*Math.pow(radius,2));

        //Question 4:
        double square_root = 5.0;
        System.out.println(Math.sqrt(square_root));

        //Question 5:
        double distance = Math.sqrt(Math.pow(85 - 5), 2) + Math.pow((50 - 10), 2);

    }
}
