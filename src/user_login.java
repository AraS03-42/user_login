import java.util.Scanner;
public class user_login {
    public static void main(String[] args) {
        String username,password,password2,confirm;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your username : ");
        username =inp.nextLine();
        System.out.print("Please enter your password : ");
        password = inp.nextLine();
        if(username.equals("patika")){
            if(password.equals("password"))
                System.out.print("You are logged in");
            else
            {
                System.out.print("You entered the password incorrectly, would you like to reset it? (Y/N) :");
                confirm = inp.nextLine();
                if(confirm.equals("Y") || confirm.equals("y")){
                    System.out.print("Please enter your new password : ");
                    password2 = inp.nextLine();

                    if(password2.equals("password")) {
                        System.out.print("Password could not be created, please enter a different password (your password cannot be the same as your previous password) :");
                        System.out.print("Please enter your new password : ");
                        password2 = inp.nextLine();

                        if (password2.equals("password"))
                            System.out.print("Password could not be created!!!");
                    }
                    else
                        System.out.print("Your password has been created");
                }
            }
        }
    }
}
