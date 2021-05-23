
import java.util.*;

public class BuyOrSellStock extends Login {
	
		int n,m,z;
		String a,txt1,txt2;
		Scanner sc = new Scanner(System.in);
		//Login l = new Login();
	public void stocks()throws Exception {
		try{
		n=sc.nextInt();
		if(n==1){
			txt1="\n\t---Hcl Technologies Limited.---";
			txt2="Cost of Share          : 906/-";
		}
		else if(n==2){
			txt1="\n\t---Burger King India Ltd.---";
			txt2="Cost of Share          : 129/-";
		}
		else if(n==3){
			txt1="\n\t---Kotak Mahindra Bank Limited.---";
			txt2="Cost of Share          : 1729/-";
		}
		else if(n==4){
			txt1="\n\t---Tata Consultancy Services Limited.---";
			txt2="Cost of Share          : 3049/-";
		}
		else if(n==5){
			txt1="\n\t---Hdfc Bank Limited.---";
			txt2="Cost of Share          : 1439/-";
		}
		
		if(n==1 || n==2 || n==3 || n==4 || n==5){
			 System.out.println(txt1);
             System.out.println(txt2);
     	   System.out.println("\nEnter 1-->   Buy Stock Trading \nEnter 2-->   Sell Stock Trading");
     	   m=sc.nextInt();
     	   switch(m){
     	   				case 1:
     	   					for(int i=0; i<3; i++){
     	   						System.out.print("Enter PIN\t:");
     	   						z=sc.nextInt();
     	   						if (PIN==z){
     	   							i=3;
     	   							System.out.println("\nTranscations sucessfull.");
     	   						break;
     	   						}else if(i>=2){
     	   							System.out.println("Transcations canceled. Please try again later.");
     	   						break;
     	   						}
     	   						else{
     	   							System.out.println("\tInvalid PIN. Please Enter valid PIN.");
     	   						}
     	   					}
     	   					break;
     	   				case 2:
     	   					for(int i=0; i<3; i++){
     	   						System.out.print("Enter PIN\t:");
     	   						z=sc.nextInt();
     	   						if (PIN==z){
     	   							i=3;
     	   							System.out.println("Transcations sucessfull.");
     	   						}else if(i>=2){
     	   							System.out.println("Transcations canceled. Please try again later.");
     	   						}
     	   						else{
     	   							System.out.println("\n\tInvalid PIN. Please Enter valid PIN.");
     	   						}
		     	   				}
     	   					break;
     	   					default :
     	   						System.out.println("\nInvalid Input");
     	   						break;
     	   	}
     	   	
		}
		else {
			System.out.print("\nInvalid Option.");
		}
		}
		catch(Exception e){
			System.out.print("\nInvalid Input.");	
			}
	   
		
 	   	sc.nextLine();
 	   	System.out.println("\n\tPress \"b\" to go back to the dashboard.\n\t---Press any button to Logout---\n");
 	   	a=sc.nextLine();
 	   	BackLogOut b = new BackLogOut();
 	   	b.call(a);
		}
		}
