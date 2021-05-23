import java.util.Calendar;
import java.util.Scanner;
public class Login {
	static String Username;
	static int PIN;
	int Year;
	int n;
	int year =Calendar.getInstance().get(Calendar.YEAR);
	
	Scanner sc= new Scanner(System.in);
	public void login() throws Exception{
		//CheckUser c = new CheckUser();
    	 
        
        for(int k=0; k<3; k++){
        	System.out.print("Enter Username\t\t:");
            Username=sc.nextLine();
           try{
            if(CheckUser.checkUsername(Username)){
           	 k=3;
           	
           	  for(int i=0; i<3;i++) {
           		 
                 	System.out.print("Enter 4-digit PIN\t:");
                 	
                     PIN=sc.nextInt();
                 	 
                  if (CheckUser.checkUserPin(PIN)) {
                 	 
                     i=3;
                        
                     
                      for(int j=0; j<3; j++){
                    	 
                     	 System.out.println("Enter the Year of Birth(YYYY-age should be above 18):");
                          Year=sc.nextInt();
                    	  
                      if (Year>1900 && (year-Year)>18) {
                     	 j=3;
                          System.out.print("\n\nWelcome "+Username+"!!. Hope you increase your income today.");
                          System.out.print("\n\tChoose from the following:\nEnter 1-->   Watch Stocks. \nEnter 2-->   Buy/Sell Stocks. "
                      			+ "\nEnter 3-->   Add/Withdraw funds. \nEnter 4-->   Change PIN. "
                      			+ "\nEnter 5-->   Raise the ticket.\n\t---Press any key to Logout--- \n");
                          try{
                          n=sc.nextInt();
                          }
                          catch(Exception e){
                        	  System.out.print("");
                          }
                          DashBoard d = new DashBoard();
                          d.Details(n);
                          
                         
                          }
                      
                          else if(j>=2){
                         	 System.out.println("\n\tYour account has been locked! Please try again later.");
                          }else{
                              System.out.println("\n\tInvalid Year! Please Enter Valid Year of Birth.");
                          }
                     
                      }
                  }else if(i>=2){
                 	 System.out.println("\n\tYour account has been locked! Please try again later.");
                  }
                  else{
                      System.out.println("\n\tInvalid PIN. Please Check Your PIN");
                  }
                
           	  }
           	
            }
            else if(k>=2){
            	 System.out.println("\n\tYour account has been locked! Please try again later.");
            }
            else{
           	 System.out.println("\n\tInvalid Username. Please Check Your Username");
            }
           }
          	 catch(Exception e){
          		 System.out.println("\n\tInvalid Input.Please Try Again");
          		
          		
          	 }
        }
   
       
	}
	
	}