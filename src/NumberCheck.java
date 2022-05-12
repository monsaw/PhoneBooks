public class NumberCheck {
    public static String numberCheck(){

        String number = "";

        while(true){
            System.out.print("Number : ");
            number = Main.input.next();
            if(number.length() == 11 && number.matches("\\d+") && number.startsWith("0")){
                break;
            }

     }

    return number;
    }
}
