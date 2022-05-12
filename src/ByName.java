import java.util.Map;

public class ByName {
    public static void byName(){

        System.out.print("Enter the name : ");

        String name = Main.input.next().toLowerCase();
        if (Main.details.containsKey(name)){

            for (Map.Entry names:
                    Main.details.entrySet()) {
                if (names.getKey().equals(name)){
                    System.out.println();
                    System.out.println("Name : " + names.getKey());
                    System.out.println("Number : " + names.getValue());
                }

            }

        } else {
            System.out.println("Record not found!");

        }
    }
    }

