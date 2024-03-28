import java.util.Scanner;

public class Util {
    static Scanner sc = new Scanner(System.in);

    public static int getRequiredNumber(String text){
        System.out.println(text);
        return sc.nextInt();
    }

    public static String getRequiredText(String text){
        System.out.println(text);
        return sc.next();
    }

    public static  String getRequiredName(){
        return getRequiredText("Enter the name");
    }
    public static  String getRequiredSurname(){
        return getRequiredText("Enter the name");
    }
    public static  int getRequiredAge(){
        return getRequiredNumber("Enter the name");
    }


}
