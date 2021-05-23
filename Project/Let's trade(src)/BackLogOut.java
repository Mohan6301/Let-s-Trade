import java.util.Scanner;
public class BackLogOut {

	
	public void call(String a) throws Exception{
		int n;
		Scanner sc=new Scanner(System.in);
		DashBoard d = new DashBoard();
		do{
			try{
		switch(a){
		case "b":
			  System.out.print("\n\tChoose from the following:\nEnter 1-->   Watch Stocks. \nEnter 2-->   Buy/Sell Stocks. "
            			+ "\nEnter 3-->   Add/Withdraw funds. \nEnter 4-->   Change PIN. "
            			+ "\nEnter 5-->   Raise the ticket.\n\t---Press any key to Logout--- \n");
	        n=sc.nextInt();
	        
	        d.Details(n);
			break;
		case "B":
			 System.out.print("\n\tChoose from the following:\nEnter 1-->   Watch Stocks. \nEnter 2-->   Buy/Sell Stocks. "
         			+ "\nEnter 3-->   Add/Withdraw funds. \nEnter 4-->   Change PIN. "
         			+ "\nEnter 5-->   Raise the ticket.\n\t---Press any key to Logout---\n ");
	        n=sc.nextInt();
	        
	        d.Details(n);
			break;
		default :
			System.out.println("Logout Successful");
			break;
		}
	}
		catch(Exception e){
			System.out.println("Logout Successful");
		}
		}
		while(a=="b");
	}
}
