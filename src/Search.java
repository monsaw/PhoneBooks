public class Search {
    public static void search(){

        System.out.println("Select your search option ");
        System.out.println("1.  By name");
        System.out.println("2.  By number");

        String option = "";
        while (true){
            System.out.print("Option : ");
             option = Main.input.next();
            if (option.equals("1") || option.equals("2")){
            break;}

    }
        if (option.equals("1")){
            ByName.byName();

        }
        else{
            ByNumber.byNumber();
        }
    }
}
