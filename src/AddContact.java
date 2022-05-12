import java.util.Map;

public class AddContact {
    public static void addContact(){


//        The temporary contact storage

        System.out.println("Enter the following details ");
        System.out.println("Phone number must be eleven digits and start with 0");
        System.out.print("Name : ");
        String name = Main.input.next().toLowerCase();

        String number = NumberCheck.numberCheck();
        System.out.println("Contact successfully saved!");
        System.out.println("Phone Book Updated !!");
        System.out.println();
        System.out.println("List of Contacts..");
        Main.details.put(name,number);
        for (Map.Entry list:
             Main.details.entrySet()) {
            System.out.println(list.getKey() +" : " + list.getValue());
        }



        MoreContact.moreContact();
    }
}
