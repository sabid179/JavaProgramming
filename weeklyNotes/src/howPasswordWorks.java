import java.util.Scanner;

public class howPasswordWorks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = "null";
        if(password.equalsIgnoreCase("null")) {
            System.out.print("Set a Password_\n :\t");
            String pass1 = sc.nextLine();
            System.out.println("Re-enter new password_\n :\t");
            String pass2 = sc.nextLine();
        }
    }
}
