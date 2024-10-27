package com.ps;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private static Dealership dealership;
    private static Scanner scanner = new Scanner(System.in);

    public static void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();

    }

    public static void display() {
        init();

//        DealershipFileManager.saveDealership(dealership);
//        System.out.println("load menu");
        boolean running = true;

        while (running) {
            System.out.println("Welcome to dealership screen");
            System.out.println("1) Show all vehicles");
            System.out.println("2) Search by price range");
            System.out.println("3) Search by make and model");
            System.out.println("4) Search by year");
            System.out.println("5) Search by color");
            System.out.println("6) Search by mileage");
            System.out.println("7) Search by vehicle type");
            System.out.println("8) Add new vehicle");
            System.out.println("9) Remove a vehicle");
            System.out.println("0) Exit");
            System.out.print("Command: ");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    processShowAllVehiclesRequest();
                    break;

                case 2:
                    processGetByPriceRequest();
                    break;

                case 3:
                    processGetByMakeModelRequest();
                    break;

                case 4:
                    processGetByYearRequest();
                    break;

                case 5:
                    processGetByColorRequest();
                    break;

                case 6:
                    processGetByMileageRequest();
                    break;

                case 7:
                    processGetByVehicleTypeRequest();
                    break;

                case 8:
                    processAddVehicleRequest();
                    break;

                case 9:
                    processRemoveVehicleRequest();
                    break;

                case 0:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Command not found, please try again.");

            }


        }
         scanner.close();
    }

    private static void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicle found");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }

    private static void processShowAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }

    private static void processGetByPriceRequest() {

    }
    private static void processGetByMakeModelRequest() {

    }
    private static void processGetByYearRequest() {

    }
    private static void processGetByColorRequest() {

    }
    private static void processGetByMileageRequest() {

    }
    private static void processGetByVehicleTypeRequest() {

    }
    private static void processAddVehicleRequest() {

    }
    private static void processRemoveVehicleRequest() {

    }
}
