package salesreport;

import java.util.Scanner; 

public class SalesReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int select;
		 int custnumber;
		 String  custname=" ";
		 double slamount;
		 double tamount=0;
		 double tax1 = 0.03;
		 double tax2 = 0.05;
		 int taxcode; 
		

         System.out.println("What Would you like to do:");
		  System.out.println("1) Make a Sales Process.");
		  System.out.println("2) FINISH THE APP.");
		  

		
		  Scanner keyboard = new Scanner(System.in);
			char response = keyboard.next().charAt(0);
			
			while (response != '1' && response != '2') {
			  System.out.println("Invalid response. Try again.");
			  response = keyboard.next().charAt(0);
			
			}
		
		 
			if (response == '1') {
	    		  
	    		 
	    		 Scanner selectscanner = new Scanner(System.in);
	    		 select= selectscanner.nextInt();
	    		// System.out.println(select.nextInt());
	    	
	    		    
	    	 //if (select==1){
	    			 
	    			  System.out.println("Welcome");
	    			  System.out.print("Please Introduce the Customer Name:");
	    			  
	    			  Scanner entryaCustomer = new Scanner (System.in); 
	    		        custname = entryaCustomer.nextLine (); //

	    		        System.out.print("Now introduce the number of the client:");
	    		        
	    		        Scanner entrycnumber = new Scanner (System.in); 
	    		        custnumber = entrycnumber.nextInt (); 
	    		        
	    		        System.out.print("Please Enter the total amount without taxes:US$");
	    		        
	    		        Scanner entryamount = new Scanner (System.in); 
	    		        slamount = entryamount.nextFloat (); 
	      
	    		       
	    		        System.out.print("Now Entry the Tax CODE [0,1,2]:");
	    		        
	    		        Scanner entryTAX = new Scanner (System.in); 
	    		        taxcode = entryTAX.nextInt (); 
	    		  
	    		        //  while (taxcode != '1' && taxcode != '2' && taxcode != '0') {
	    				//	  System.out.println("\nInvalid response. Try again.");
	    					//  taxcode = entryTAX.next().charAt(0);
	    					
	    		        
	    		        switch(taxcode) {
	    		        case 0:
	    		          tamount=slamount;
	    		          System.out.println("The client is exempt from taxes!"); 
	    		          break;
	    		        case 1:
	    		        	 tamount=(slamount*tax1)+slamount;
	    		        	 System.out.println("YOU WILL RECEIVE A 3% TAX ON YOUR PURCHASE!"); 
	    		          break;
	    		        case 2:
	    		        	 tamount=(slamount*tax2)+slamount;
	    		        	System.out.println("YOU WILL RECEIVE A 5% TAX ON YOUR PURCHASE!"); ;
	    		          break;
	    		      }
	    		     //  }
	    		        
	    		
	    		        System.out.println(".......................................Sales Report..............................................");       
	    				  
	    		     System.out.println("CUSTOMER:"+custname);
	    		     System.out.println("CUSTOMER#:"+custnumber);	
	    		     System.out.println("SUB-TOTAL IS:"+slamount);       
	    		     System.out.print("TOTAL:"+tamount);     
			}
	    		     else if (response == '2') {
	   				  System.out.print("Thank you, and have a nice day!"); 
	    		        
	    	 }
	    			  
	    		
	    	/* else if (select==2){
	    		 
	    		  System.out.print("Thank you and have a nice day!"); 
	    	
	    			}	

	    	 */
	    	 
			} 
	          }
	
	      
	  
		
		  
	 
	 
	
	
