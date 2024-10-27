package com.ps;

public class UserInterface {

    private static Dealership dealership;

    public static void init() {
        dealership = DealershipFileManager.getDealership();
        //loading the dealership and inventory from a file
    }

   public static void display() {
       init();

       DealershipFileManager.saveDealership(dealership);
       System.out.println("load menu");
       //load the menu
   }
}
