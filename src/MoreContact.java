public class MoreContact {
    //    Method to give more option either to add or search
        public static void moreContact(){

            System.out.println();
            System.out.println("Select any of the options to perform more task");
            System.out.println("1.      Add more Contact");
            System.out.println("2.      Search");
            System.out.println("3.      Exit");


            String option = "";
            while (true) {
                System.out.print("Select : ");
                option = Main.input.next();
                if (option.equals("1") || option.equals("2") || option.equals("3")) {
                    break;
                }
            }


            if (option.equals("1")){
                AddContact.addContact();
            }
            else if(option.equals("2")) {
                Search.search();

            }

            else{
                System.out.println();
                System.out.println("You just chose to exit the program ,bye!.");
                return;
            }

        }
}

