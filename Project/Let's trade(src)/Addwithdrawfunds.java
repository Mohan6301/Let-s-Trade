import java.util.*;

 

public class Addwithdrawfunds extends Login{
    int m,p,bt,f,v,cvv,r,c,z,d,U;  
    String upi,e,o; 
    
    
    public  void funds() throws Exception{
    	try{
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter 1-->   Add Funds. \nEnter 2-->   Withdraw Funds.");
         c=sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Enter 1-->   UPI Payment. \nEnter 2-->   Debit Card.");
                    z=sc.nextInt();
                                    switch(z){
                                    case 1:
                                    	
                                        System.out.print("Enter the UPI ID\t:");
                                        sc.nextLine();
                                         upi=sc.nextLine();
                                       System.out.print("Enter the PIN\t:");
                                        p=sc.nextInt();
                                        if(p==PIN){//Pin equals Pin
                                        System.out.println("\nConnecting to the appllication..... \nPayment Sucessfull.");
                                      }else{
                                          System.out.println("Invalid PIN. Transaction has failed.");
                                      }
                                      break;
                                    case 2:
                                    	
                                       System.out.print("Enter the card No(Enter last 4-digits)\t:");
                                       
                                        U=sc.nextInt();
                                        
                                        if(Integer.toString(U).length()==4){
                                       System.out.print("Enter the CVV(3-digit number)\t:");
                                      cvv=sc.nextInt();
                                      for(int i=0; i<3; i++){
               	   						System.out.println("Enter PIN\t:");
               	   						d=sc.nextInt();
               	   						if (PIN==d){
               	   							i=3;
               	   							
               	   						}else if(i>=2){
               	   							System.out.println("Transcation cancelled. Please try again later.");
               	   						}
               	   						else{
               	   							System.out.println("Invalid PIN. Please Enter valid PIN.");
               	   						}
          		     	   				}
                                        
                                      System.out.println("Transcation sucessfull.");
                                        }
                                        else{
                                        	System.out.println("Invalid input");
                                        }
                                    break;
                                    
                                    default :
                                    	System.out.println("Invalid input");
                           				break;
                                    }
                    break;
        
           case 2:
                System.out.println("\nEnter 1-->   Bank Transfer. \nEnter 2-->   Gpay.");
                 bt=sc.nextInt();
                        switch(bt){
                        case 1:
                        	sc.nextLine();
                            System.out.print("Enter Bank Name\t:");
                            o=sc.nextLine();
                            System.out.print("Enter Account Number:(must contain 8-12 digits)\t:");
                             r=sc.nextInt();
                             sc.nextLine();
                             System.out.print("Enter Accout Holder Name\t: ");
                             String N=sc.nextLine();
                            System.out.print("Enter the Ifsc Code\t: ");
                            e=sc.nextLine();
                            if(Integer.toString(r).length()==8 || Integer.toString(r).length()==9 || Integer.toString(r).length()==10 ||Integer.toString(r).length()==11 ||Integer.toString(r).length()==12)
                            {
                                System.out.print("\t---Transaction was sucessfull---");
                            }
                            break;
                        case 2:
                        	//sc.nextLine();
                            System.out.print("Enter your Gpay Number(must contain 10-digits)\t:");
                             f=sc.nextInt();
                            if((Integer.toString(f).length())==10){
                            	for(int i=0; i<3; i++){
         	   						System.out.print("Enter PIN\t: ");
         	   						z=sc.nextInt();
         	   						if (PIN==z){
         	   							i=3;
         	   							System.out.println("\t---Transcations sucessfull---");
         	   						}else if(i>=2){
         	   							System.out.println("Transcations canceled. Please try again later.");
         	   						}
         	   						else{
         	   							System.out.println("Invalid PIN. Please Enter valid PIN.");
         	   						}
    		     	   				}
                            	
                            }
                            else {
                            	System.out.println("Transaction cancalled.Invalid Gpay number.");
                            }
                            break;
                        default :
                        	System.out.println("Invalid input");
               				break; 
                       
                        }
                  break;
           default :
           	System.out.println("Invalid input");
               				break;   
        	}
        
    	}
    	catch(Exception e){
    		System.out.println("Invalid Input. Try again");
    	}
    	
    	 System.out.println("\n\tPress \"b\" to go back to the dashboard.\n\tPress any button to Logout.\n");
    	    String a=sc.nextLine();
    	    BackLogOut b = new BackLogOut();
    	    b.call(a);
    }
   
}