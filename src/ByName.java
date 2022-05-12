import java.util.Map;

public class ByName {
    public static void byName(){
        System.out.print("Enter the name : ");
        String name = Main.input.next().toLowerCase();

//        Line to check if the name enter is a sunpart of the expected name.
//        for (Map.Entry names:
//                Main.details.entrySet())
//            if ( !names.getKey().toString().equals(name)) {
//                System.out.println("List of contacts that start with " + name);
//                break;
//
//            }
        System.out.println("Getting a name means you searched for the exact name , \n" +
                "Getting multiple names means your search word prefix some of the name in the storage");
            for (Map.Entry names:
                    Main.details.entrySet()) {
                if (names.getKey().equals(name)){

                    System.out.println();

                    System.out.println("Name : " + names.getKey());
                    System.out.println("Number : " + names.getValue());
                    break;
                }
                else if (names.getKey().toString().startsWith(name)){
                    System.out.println();

                    System.out.println("Name : " + names.getKey());
                    System.out.println("Number : " + names.getValue());
                }
                else {
                    System.out.println("Record not found!");
                }

            }

//        }
    }
}
