/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class MAIN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        login user = new login();

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cellphone number: ");
        String phone = input.nextLine();

        String registration = user.registerUser(
                username, password, phone);

        System.out.println(registration);

        if (registration.equals("User is successfully registered.")) {

            System.out.println();
            System.out.println("LOGIN");

            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = input.nextLine();

            boolean status = user.loginUser(
                    loginUsername,
                    loginPassword,
                    username,
                    password);

           
                
 if (status) {
    System.out.println("Welcome TO QuickChat "); 
     System.out.println("option 1') send Messages");
     System.out.println("option 2') Recently send messages - coming soon");
     System.out.println("option 3') quits");

     int controllerv = Integer.parseInt(input.nextLine());
     
   switch (controllerv) {
    case 1:
        System.out.println("How many Messages would you like to send?");
        
        int howMany =Integer.parseInt(input.nextLine());
        

        for (int i = 1; i <= howMany; i++) {
            System.out.print("Enter recipient (+27...): ");
            String rec = input.nextLine();
            System.out.print("Enter message: ");
            String msgText = input.nextLine();

    if (msgText.length() > 250) {
        System.out.println("Please enter a message of less than 250 characters.");
         i--;
         continue;
  }

        Messages m = new Messages(i,rec, msgText );
        System.out.println(m.checkRecipientCell());
       // System.out.println(m.checkMessageLength());
        System.out.println("Message Hash: " + m.getMessageHash());
        System.out.println("1=Send 2=Disregard 3=Store");
       
    int choice = input.nextInt();
        input.nextLine();
        System.out.println(m.sentMessage());
        System.out.println("MessagesID: " + m.getMessageID());
        System.out.println("MessagesHash: " + m.getMessageHash());
        System.out.println("Recipient: " + m.getRecipient());
        System.out.println("Message: " + m.sentMessage());
        System.out.println("");
 }
        System.out.println("Total messages sent: " + howMany);
        break;
  
    case 2:
      System.out.println("Coming Soon.");
        break;

    case 3:
      System.out.println("Goodbye");
      System.exit(0);
        break;

    default:
     System.out.println("Invalid option");
     break;
 }
  } else {
     System.out.println("Login failed");
    }
     } else {
       System.out.println("Registration UnSuccessfull");
      }
    }
}
                
          
        
    

    

