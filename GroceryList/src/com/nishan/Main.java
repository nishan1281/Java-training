package com.nishan;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        while (!quit) {
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItme();
                    break;

                case 5:
                    searchForItem();
                    break;

                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstruction ()
    {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice option.");
        System.out.println("\t 1 - To print the list of Grocery items.");
        System.out.println("\t 2 - To add an item in the Grocery list.");
        System.out.println("\t 3 - To modify an item in the Grocery list.");
        System.out.println("\t 4 - To remove an item in the Grocery list.");
        System.out.println("\t 5 - To search an item in the Grocery list");
    }

    public static void addItem()
    {
        System.out.print("Please enter the item to add in grocery list : ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    public static void modifyItem()
    {
        System.out.print("Please enter current item name to modify : ");
        String currentItem = scanner.nextLine();

        System.out.print("Please enter new item name to add : ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItme()
    {
        System.out.print("Please enter item name to removed : ");
        String item = scanner.nextLine();

        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem()
    {
        System.out.print("Please enter search item : ");
        String searchItem = scanner.nextLine();
      if (groceryList.searchItem(searchItem))
      {
          System.out.println("Found " + searchItem + " in your grocery list.");
      }

      else
      {
          System.out.println(searchItem + ", is not found in your grocery list ");
      }

    }
}
