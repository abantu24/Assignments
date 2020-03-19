package assignments;

import java.util.Scanner;

public class Bankapplication {
	
	static int openbalance =10000;

	void deposit(int damount)
	{
		System.out.println("The balance before deposit:"+openbalance);
		System.out.println();
		
		 openbalance+=damount;
		
	}
	
	void withdraw(double withamount)
	{
		System.out.println("Amount avaiable:"+openbalance);
		System.out.println();
	 if(withamount<openbalance)
	 {
		 openbalance-=withamount;
		 
		 System.out.println("successfully withdraw");
		 System.out.println();
		 System.out.println("Afterwithdrawl:"+openbalance);
		 
		 
	 }else{
		 
		 System.out.println("Sorry insufficent Balance:"+openbalance);
	 }
	
	 System.out.println();
	}
	
	void balanceenq(){
		
		System.out.println("the balance amount available:"+openbalance);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		
		Bankapplication app = new Bankapplication();
		
		while(true)
		{
			System.out.println("      Welcome      ");
			System.out.println("-------------------");
			System.out.println("     1.Deposit     ");
			System.out.println("     2.Withdraw    ");
			System.out.println("     3.Balance Enquiry");
			System.out.println("     4.Exit        ");
			System.out.println("-------------------");
			System.out.println("Please make your choice:");
			int choice = sc.nextInt();
			
		switch(choice)
		{
		
		case 1: System.out.println("Enter the amount you want to deposit:");
		       
		       int damount= sc.nextInt();
		       
		       app.deposit(damount);
		       		              
		       System.out.println("The balance after deposit:"+openbalance);
		       System.out.println();
		       break;
		       
		       
		case 2: System.out.println("Enter the amount you want to withdraw:");
				double wamount = sc.nextDouble();
				
			    app.withdraw(wamount);
			    break;
			    
		case 3: app.balanceenq();
		      
		break;
		
		case 4: System.out.println("Thank you for using this app");
				System.exit(0);
				break;
				default: System.out.println("Choose the option between 1 to 4");
		       
		}
			
		}
				
	}

}
