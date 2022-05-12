import java.util.Map;

public class ByNumber {
    public static void byNumber(){

        System.out.print("Enter the number : ");

        String name = Main.input.next().toLowerCase();
        if (Main.details.containsValue(name)){

            for (Map.Entry names:
                    Main.details.entrySet()) {
                if (names.getValue().equals(name)){
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
