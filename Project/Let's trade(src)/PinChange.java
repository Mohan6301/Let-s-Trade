import java.io.IOException;
import java.util.Scanner;
public class PinChange extends Login {
	String u1,a;
	int p1,p2,p3;
	
	Scanner sc= new Scanner(System.in);
	public void change() throws Exception{
		
		try{
			System.out.println("Enter username");
			
			u1=sc.nextLine();
			if(u1.equalsIgnoreCase("admin")){
				System.out.println("You cannot change admin credentials");
			}else if(u1.equals(Username)){
				for(int i=0; i<3; i++){
					
					
					
					System.out.println("Enter current PIN: ");
					p1=sc.nextInt();
					if (PIN==p1){
						i=3;
						for(int j=0;j<3;j++){
							System.out.println("Enter the New PIN");
							p2=sc.nextInt();
							if(Integer.toString(p2).length()==4){
								System.out.println("Confirm New PIN");
								p3=sc.nextInt();
								if(p2==p3){
									j=3;
									Update changePin = new Update();
									changePin.UpdatePin(u1, p2);
									System.out.println("Sucessfully Changed");
									PIN=p2;
								}
								else{
									System.out.println("New PIN and Confirm PIN does not match");
									}
							}
							else{
								System.out.println("PIN must contains 4-digits.");
							}
						}
						
						
						
					}
						else if(i>=2){
						System.out.println("Canceled. Please try again later.");
				
					}
					else{
						System.out.println("Invalid PIN. Please Enter valid PIN.");
					}
				}
			}
			else{
				System.out.println("Invalid credentials");
			}
			
			}
			catch(Exception e){
				e.getStackTrace();
				System.out.println("Invalid Input.");	
			}
				
			
		
		sc.nextLine();
 	   	System.out.println("\n\tPress \"b\" to go back to the dashboard.\n\tPress any button to Logout.\n");
 	   	a=sc.nextLine();
 	   	BackLogOut b = new BackLogOut();
 	   	b.call(a);
	
	}
	}