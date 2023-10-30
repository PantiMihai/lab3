package ex1;
import java.util.Scanner;
class ex1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        printMiddleCharacter(userName);
    }
//    if(string.lenght)
    public static void printMiddleCharacter(String str)
    {
        int len = str.length();
        int middle = len / 2;
        System.out.println(str.charAt(middle));
    }
}