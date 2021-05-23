import java.util.Scanner;

class watchStocks {
	
	String a;
	
	Scanner sc=new Scanner(System.in);
    
    public void Stock(int n) throws Exception{
        
    
   
     switch (n)
    {
       case 1:
    	   System.out.println("\n\t---Hcl Technologies Limited.---");
           System.out.println("Cost of Share          : 906/-");
           System.out.println("Relative Strength Index: 14");
           System.out.println("Market cap             : 244094.18cr");
           System.out.println("Face Value             : 2");
           System.out.println("Equity                 : 542.73");
           System.out.println("Earnings per Share     : 41.1");
           System.out.println("-------------------------------------------");
           break;
       case 2:
    	   System.out.println("\n\t---Burger King India Ltd.---");
           System.out.println("Cost of Share          : 129/-");
           System.out.println("Relative Strength Index: 14");
           System.out.println("Market cap             : 4979.8cr");
           System.out.println("Face Value             : 10");
           System.out.println("Equity                 : 383.5");
           System.out.println("Earnings per Share     : 0");
           System.out.println("-------------------------------------------");
           break;
       case 3:
    	   System.out.println("\n\t---Kotak Mahindra Bank Limited.---");
           System.out.println("Cost of Share          : 1729/-");
           System.out.println("Relative Strength Index: 14");
           System.out.println("Market cap             : 346543.78cr");
           System.out.println("Face Value             : 5");
           System.out.println("Equity                 : 990.92");
           System.out.println("Earnings per Share     : 43.1");
           System.out.println("-------------------------------------------");
           break;
       case 4:
    	   System.out.println("\n\t---Tata Consultancy Services Limited.---");
           System.out.println("Cost of Share          : 3049/-");
           System.out.println("Relative Strength Index: 14");
           System.out.println("Market cap             : 1123919.77cr");
           System.out.println("Face Value             : 1");
           System.out.println("Equity                 : 369.91");
           System.out.println("Earnings per Share     : 90.1");
           System.out.println("-------------------------------------------");
           break;
       case 5:
    	   System.out.println("\n\t---Hdfc Bank Limited.---");
           System.out.println("Cost of Share          : 1439/-");
           System.out.println("Relative Strength Index: 14");
           System.out.println("Market cap             : 778850.97cr");
           System.out.println("Face Value             : 1");
           System.out.println("Equity                 : 551.52");
           System.out.println("Earnings per Share     : 57.7");
           System.out.println("-------------------------------------------");
           break;
       default :
			System.out.println("Invalid Input");
           break;
          
    }
     sc.nextLine();
     System.out.println("\n\tPress \"b\" to go back to the dashboard.\n\tPress any button to Logout.\n");
     a=sc.nextLine();
     BackLogOut b = new BackLogOut();
     b.call(a);
    }
    
   
}
