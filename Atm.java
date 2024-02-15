package importjava.util.scanner;

import java.util.Scanner;  
public class Atm{
	public static void main(String[] args) {
		
	int balance=350001;		
	int deposite=500;
	int withdraw=1000;
	//to get user choice
	System.out.println("PLEASE INSERT YOUR CARD");
	System.out.println("ENTER YOUR PIN");
	Scanner sc = new Scanner(System.in); 
	int pin;
	Scanner c=new Scanner(System.in);
	pin=c.nextInt();
	if(pin==3556) {
	while(true)
	{
		System.out.println("FEDERAL BANK WELCOMES YOU");
		System.out.println("CHOOSE 1 FOR WITHDRAW");
		System.out.println("CHOOSE 2 FOR DEPOSITE");
		System.out.println("CHOOSE 3 FOR BALANCE ENQUIRY");
		System.out.println("CHOOSE 4 FOR EXIT");
		
		Scanner b=new Scanner(System.in);
		int choice=b.nextInt();
		
	
		 
         switch (choice)
         {
         case 1:
        	 System.out.print("Enter money to withdraw:");
   		  withdraw = sc.nextInt(); 
   		 if (balance>=withdraw)
   		 {
   			 balance= balance-withdraw;
   			 System.out.println("PLEASE COLLECT YOUR CASH");
   			 
   		 }
   		 else {
   			 System.out.println("INSUFFICEN BALANCE");
   			 System.out.println("");
   		 }
         
   		 break;
         case 2:{
        	//DEPOSIT IS ADDED TO BALANCE
    		 System.out.println("DEPOSIT YOUR MONEY");
    		 int deposit= balance+deposite;
    		//to get the deposit amount from the user
    		  deposit = sc.nextInt();
    		
    		   balance=balance+deposit;
    		   System.out.println("YOUR MONEY IS SUCCESSFULLY DEPOSITED");
    			 System.out.println("");
    			
         }
         break;
         case 3:{
             System.out.println("Balance : "+balance);  
             System.out.println("");  
        	 
         }
         break;
		 
         case 4:{
        	  System.out.println("THANK YOU VISIT AGAIN.🙏"); 
        	  System.out.println(".---FEDERAL BANK."); 
        	 
        	 System.exit(0);
         }
         
         }
 	
	}
	
         }	
				   
      
	else {
		 System.out.println("INCORRECT PIN");
	}
	}
}
