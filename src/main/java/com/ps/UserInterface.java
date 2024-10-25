package com.ps;

public class UserInterface {

    private static Dealership dealership;

    public static void init() {
        dealership = DealershipFileManager.getDealership();
        //loading the dealership and inventory from a file
    }

   public static void display() {
       init();
       System.out.println(dealership.getAllVehicles());

       System.out.println("load menu");
       //load the menu
   }
}
