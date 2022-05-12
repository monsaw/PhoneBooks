import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String , String> details = new HashMap<String, String>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


//       Option Prompt the users to either save or search

        System.out.println("Welcome to my PhoneBook App");

        System.out.println("1.       Add Contact");

        while(true){
            System.out.println();
            System.out.print("Enter 1 to add contact : ");
            String option = input.next();
            if (option.equals("1") ){
                System.out.println();
                AddContact.addContact();
                break;
        }

        }

    }


}