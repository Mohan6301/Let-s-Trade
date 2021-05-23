import java.util.Scanner;
public class RaiseTicket extends Login 
{
	 String Uname,tcktname,tcktdes;
     int Pin;
    public void ticket() throws Exception 
    {
       try{
        Scanner sc=new Scanner(System.in);
        
        for(int i=0; i<3; i++){
        	 System.out.print("Enter the Username\t: ");
        	  Uname=sc.nextLine();
			if (Uname.equals(Username)){
				i=3;
				 for(int j=0; j<3; j++){
						System.out.print("Enter PIN\t\t:");
						Pin=sc.nextInt();
						if (PIN==Pin){
							j=3;
							sc.nextLine();
							 System.out.print("Enter the Ticket name\t:");
					            tcktname=sc.nextLine();
					            System.out.println("Enter Ticket description");
					            tcktdes=sc.nextLine();
					            System.out.println("ticket raised successfully.");
						}else if(i>=2){
							System.out.println("Invalid PIN. Please try again later.");
						}
						else{
							System.out.println("Invalid PIN. Please Enter valid PIN.");
						}
						}
			}else if(i>=2){
				System.out.println("Invalid Username. Please try again later.");
			}
			else{
				System.out.println("Invalid Username. Please Enter valid UserName.");
			}
			}
  
    }
       catch(Exception e){
    	   System.out.println("Invalid input");
       }
       System.out.println("\n\tPress \"b\" to go back to the dashboard.\n\tPress any button to Logout.\n");
	    String a=sc.nextLine();
	    BackLogOut b = new BackLogOut();
	    b.call(a);
    }
    }
 