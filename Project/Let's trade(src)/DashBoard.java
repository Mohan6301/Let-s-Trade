import java.util.Scanner;

public class DashBoard {
	int ch1;
	
	
	Scanner sc=new Scanner(System.in);
	
	public void Details(int n) throws Exception{
		
		try{
		switch (n)
         {
            case 1:
            	 watchStocks w = new watchStocks();
                System.out.println("\n\tChoose from the following:"
                		+ "\nEnter 1-->   Hcl Technologies Limited. "
                		+ "\nEnter 2-->   Burger King India Ltd. \nEnter 3-->   Kotak Mahindra Bank Limited. "
                		+ "\nEnter 4-->   Tata Consultancy Services Limited. \nEnter 5-->   Hdfc Bank Limited.");
                ch1=sc.nextInt();
               
                w.Stock(ch1);
                
                break;
            case 2:
            	 BuyOrSellStock b =new BuyOrSellStock();
            	 System.out.println("\n\tChoose from the following:"
                 		+ "\nEnter 1-->   Hcl Technologies Limited. "
                 		+ "\nEnter 2-->   Burger King India Ltd. \nEnter 3-->   Kotak Mahindra Bank Limited. "
                 		+ "\nEnter 4-->   Tata Consultancy Services Limited. \nEnter 5-->   Hdfc Bank Limited.");
       				 b.stocks();
       		 
                break;
            case 3:
            	Addwithdrawfunds add = new Addwithdrawfunds();
            	add.funds();
                break;
            case 4:
            	sc.nextLine();
            	PinChange s =new PinChange();
            	s.change();
                break;
            case 5:
            	RaiseTicket r =new RaiseTicket();
            	r.ticket();
                break;
                
            default :
            	System.out.println("Logout sucessful.");
            	break;
         }
	}
		catch(Exception e){
			System.out.println("Invalid Input");
			sc.nextLine();
			System.out.println("\n\tPress \"b\" to go back to the dashboard.\n\tPress any button to Logout.\n");
	 	   	String a=sc.nextLine();
	 	   	BackLogOut b = new BackLogOut();
	 	   	b.call(a);
		}
	}
}
