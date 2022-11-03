import java.util.ArrayList;
import java.util.Scanner;

public class ListMain{
    private static Scanner scan = new Scanner(System.in);
    private static ListGrocery GroceryList = new ListGrocery();
    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        while(!quit){
            System.out.println("Enter your choice! --help 0");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    GroceryList.PrintList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                case 4:
                    removeItem();
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
    public static void printInstructions(){
        System.out.println("0 - To print choice option");
        System.out.println("1 - To print the list of grocery items");
        System.out.println("2 - To add an item");
        System.out.println("3 - To modify an item in the list");
        System.out.println("4 - To remove an item from the list");
        System.out.println("5 - To search for an item in the list");
        System.out.println("6 - To quit the application");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        GroceryList.addList(scan.nextLine());
    }

    public static void PrintList(){
        System.out.println("Your purchases are ");
        System.out.println("not Printed");
        GroceryList.PrintList();
    }

    public static void modifyItem(){
        System.out.println("Enter item number: ");
        int itemNo = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter replacement item");
        String itemName = scan.nextLine();
        GroceryList.modifyGroceryItem(itemNo, itemName);
    }

    public static void removeItem(){
        System.out.println("Enter remove number");
        GroceryList.removeGroceryItem(scan.nextInt());
    }
    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scan.nextLine();
        if(GroceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}



