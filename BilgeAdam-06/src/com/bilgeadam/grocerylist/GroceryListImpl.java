package com.bilgeadam.grocerylist;

import java.util.Scanner;

public class GroceryListImpl {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean flag = true;
        int choice = 0;

        while (flag) {
            printInstructions();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItemToList();
                    break;
                case 3:
                    modifyItemToList();
                    break;
                case 4:
                    removeItemToList();
                    break;
                case 5:
                    searchItemInList();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }

    private static void searchItemInList() {
        System.out.println("Please write item name to search: ");
        String item = scanner.nextLine();
        // ternary operator
        String message = (groceryList.isInTheGroceryList(item)) ? (item + " is in the list") : (item + " is NOT in the list");
        System.out.println(message);
    }

    private static void removeItemToList() {
        System.out.println("Please write item name for remove: ");
        groceryList.removeItemFromGroceryList(scanner.nextLine());
    }

    private static void modifyItemToList() {
        System.out.println("Please write current item name: ");
        String currentItem = scanner.nextLine();
        System.out.println("Please write new item name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyItemInGroceryList(currentItem, newItem);
    }

    private static void addItemToList() {
        System.out.println("Please write item name: ");
        String item = scanner.nextLine();
        groceryList.addGroceryItem(item);
    }

    private static void printInstructions() {
        System.out.println("Select one option: ");
        System.out.println("\t1- Print the grocery list items");
        System.out.println("\t2- Add an item to grocery list");
        System.out.println("\t3- Modify an item into grocery list");
        System.out.println("\t4- Remove an item from grocery list");
        System.out.println("\t5- Search an item into grocery list");
        System.out.println("\t6- Quit the application");
    }
}
