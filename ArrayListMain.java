import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListMain{
    private static Scanner scan = new Scanner(System.in);
    private static ArrayListMobile phoneBook = new ArrayListMobile("000-0000-0000");
    public static void main(String[] args){
        boolean quit = false;
        int SelectNumber = 0;
        Instruction();
        while(!quit){
            System.out.println("Enter action:");
            SelectNumber = scan.nextInt();
            scan.nextLine();
            switch(SelectNumber){
                case 0:
                    Instruction();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    printList();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Quit Application");
            }
        }
    }

    private static void Instruction(){
        System.out.println("-0- to indicate this explanation");
        System.out.println("-1- to add contact to Mobile contact ledger");
        System.out.println("-2- to print contacts");
        System.out.println("-3- to modify the contact");
        System.out.println("-4- to quit this application");
    }

    private static void addContact(){
        System.out.println("Enter new name");
        String name = scan.nextLine();
        System.out.println("Enter new PhoneNumber");
        String phoneNumber = scan.nextLine();
        ArrayListContact contact = ArrayListContact.createArrayListContact(name, phoneNumber);
        if(phoneBook.M_addContact(contact)){
            System.out.println("Succesfully add your Input data!");
        }else{
            System.out.println("already existed same name person");
        }
    }

    private static void printList(){
        phoneBook.M_printall();
    }

    private static void modifyContact(){
        System.out.println("Enter existing contact name");
        String name = scan.nextLine();
        int index_num = phoneBook.M_findName(name);
        if(index_num >= 0){
            System.out.println("confirm the existence of this name");
        }else{
            System.out.println("Cannot find the name");
            return;
        }
        System.out.println("Enter new name");
        String newName = scan.nextLine();
        System.out.println("Enter new PhoneNumber");
        String PhoneNumber = scan.nextLine();
        ArrayListContact contact = ArrayListContact.createArrayListContact(newName, PhoneNumber);
        phoneBook.M_modifyContact(index_num, contact);
        System.out.println("Successfully modify the telephonebook");
    }
}