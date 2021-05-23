import java.util.Scanner;

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;*/

public class Mainclass {
    public static void main(String[] args) throws Exception {
   	
    	String Username;
    	int PIN;
    	boolean turn=false;
    	try{
    	Scanner sc= new Scanner(System.in);
    	 System.out.println("====================Let`s Trade=========================");
         System.out.println("                        (Username :Admin      PIN : 1234)\n");
         
         System.out.println("\n\tEnter 1 --> SignUp");
         System.out.println("\n\tEnter 2 --> Login");
         int ch = sc.nextInt();
         if(ch==1){
        	 System.out.print("Enter your first name\t:");
        	 sc.next();
        	 sc.nextLine();
        	 System.out.print("Enter your last name\t:");
        	 sc.nextLine();
        	 System.out.print("Enter username\t:");
        	 Username = sc.nextLine();
        	 System.out.print("Enter 4-digit PIN\t:");
        	 PIN=sc.nextInt();
        	 if(PIN>=1000 && PIN<=9999){
        	 Update signUp = new Update();
        	 signUp.signUp(Username, PIN);
        	 turn=true;
        	 }
        	 else{
        		 System.out.println("PIN should only contain 4-digits");
        		 
        	 }
         }
         else if(ch==2){
        	 System.out.println("\t-----------Login-----------");
        	 Login l = new Login();
         	l.login();
         }else{
        	 System.out.println("Please enter form given options");
         }
    	
         if(turn){
        	 System.out.println("\t-----------Login-----------");
    	Login l = new Login();
    	l.login();
         }
    	
    	}catch(Exception e){
    		System.out.println("Invalid input.");
    	}
         
    	
    	
    	
     }
}