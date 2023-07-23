package Resturaunt;

import java.util.Scanner;
class hotelDetail{
	{
		System.out.println("Welcome to HOTEL");
		String gstno="29CCFPJ5208Q19Z8";
		System.out.println("GST number is "+gstno);
	}
}
class DetailsOfCustomer{
	String name;
	   int age;
	   long phno;
	   String a,b,c,d;
	   int count=0,count1=0,count2=0,count3=0,count4=0,count5;
	   int choice,choice1;
	   int ss,ss1,ss2,ss3;
	  String ans;
	  
	  float gst;
	  float bill;
	   String s1="TANDOORI ROTI";
	   String s2="BUTTER NAAN";
	   String s3="CHOLE BHATURE";
	   String s4="NORTH INDIAN MEALS"; 
		   float f1=30.00f;
		   float f2=35.00f;
		   float f3=120.00f;
		   float f4=170.00f;
		   
	   Scanner sc=new Scanner(System.in);
	   public void details() {
		   System.out.println("Enter your name:");
		   name=sc.nextLine();
		   System.out.println("enter your age:");
		   age=sc.nextInt();
		   System.out.println("enter your Phone Number:");
		   phno=sc.nextLong();   
	   }
	   public void menuDetails() {
		   System.out.println("What do you like to have :");
		   System.out.println("MENU");
		   System.out.println("----------------------------------------------------------------------------------------------");
		   System.out.println("NAME"+"                    "+"PRICE(in)RS");
           System.out.println("1."+s1+"            "+f1);
           System.out.println("2."+s2+"              "+f2);
           System.out.println("3."+s3+"            "+f3);
           System.out.println("4."+s4+"       "+f4);
           System.out.println();
           System.out.println("----------------------------------------------------------------------------------------------");
}
	   
	  public void addDetails() {
		  
		  do {
			  System.out.println("Do you wish to continue for order(y/n)");
	          ans=sc.next().toLowerCase();
			  if(ans.equalsIgnoreCase("y")) {
    	   System.out.println("Enter your choice of food;");
           choice=sc.nextInt();
           switch (choice) {
           
           case 1:
        	   a=s1;
        	   System.out.println(a);
        	   System.out.println("Enter total plate");
        	   count1+=sc.nextInt();
        	   System.out.println("Total plate"+" "+count1);
        	   ss=1;
        		break;
		     case 2:
        	   b=s2;
        	   System.out.println(b);
        	   System.out.println("Enter total plate");
        	   count2+=sc.nextInt();
        	   System.out.println("Total plate"+" "+count2);
        	  ss1=1;
          		break;
		case 3:
        	   c=s3;
        	   System.out.println(c);
        	   System.out.println("Enter total plate");
        	   count3+=sc.nextInt();
        	   System.out.println("Total plate"+" "+count3);
        	   ss2=1;
        	   break;
           case 4:
        	   d=s4;
        	   System.out.println(d);
        	   System.out.println("Enter total plate");
        	   count4+=sc.nextInt();
        	   System.out.println("Total plate"+" "+count4);
        	   ss3=1;
        	   break;
        	default: 
        		System.out.println("Item not found");
        		count=count1+count2+count3+count4;
        		break;
           }
          
			  }
           
		  }while(ans.equalsIgnoreCase("y"));
		  
         //  return;
}
	   void showOrderDetails() {
		   System.out.println("DO YOU WISH TO SEE ORDER DETAILS(y/n)");
	          ans=sc.next().toLowerCase();
			  if(ans.equalsIgnoreCase("y")) {
			   count5=count+count1+count2+count3+count4; 
		 System.out.println("----------------------------------------------------------------------------------------------");
		  System.out.println("Your total plate of order" +" "+"TANDOORI ROTI"+" "+"is"+"  "+count1);
		  System.out.println("Your total plate of order"+" "+"BUTTER NAAN" +" "+"is"+"  "+count2);
		  System.out.println("Your total plate of order"+" "+"CHOLE BHATURE" +" "+"is"+"  "+count3);
		  System.out.println("Your total plate of order"+" "+"NORTH INDIAN MEALS" +" "+"is"+"  "+count4);
		  System.out.println("----------------------------------------------------------------------------------------------");
	   }
			  //
	   }
	   public void bill() {
		   System.out.println("Do you wish to continue for bill(y/n)");
	          ans=sc.next().toLowerCase();
			  if(ans.equalsIgnoreCase("y")) {
		   System.out.println("----------------------------------------------------------------------------------------------");
		   System.out.println("YOUR BILL IS ");
				System.out.println("Bill amount without gst is "+count5*f1);
				bill=count5*(f1+(f1*18.00f/100));
				System.out.println("Bill amount with 18% gst is "+bill);
				 System.out.println("----------------------------------------------------------------------------------------------");
				
	   }
			  else {
					System.err.println("INVALID CHOICE"); 
				 }
	   }
	   void dispDetails() {
		   System.out.println("Customer details are:");
		   System.out.println("Customer name is "+name);
		   System.out.println("Customer age is "+age);
		   System.out.println("Customer phno is "+phno);
		   System.out.println("----------------------------------------------------------------------------------------------");
		   System.out.println("YOUR ORDERS ARE");
		   System.out.println("Your total plate of order" +" "+"TANDOORI ROTI"+" "+"is"+"  "+count1);
			  System.out.println("Your total plate of order"+" "+"BUTTER NAAN" +" "+"is"+"  "+count2);
			  System.out.println("Your total plate of order"+" "+"CHOLE BHATURE" +" "+"is"+"  "+count3);
			  System.out.println("Your total plate of order"+" "+"NORTH INDIAN MEALS" +" "+"is"+"  "+count4);
			 System.out.println("----------------------------------------------------------------------------------------------");
             System.err.println("THANK YOU");
	   }
}
public class ResturantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		hotelDetail h=new hotelDetail();
		DetailsOfCustomer d= new DetailsOfCustomer();
		   d.details();
		int choice1;
		 System.out.println("enter your choice");
		   System.out.println("1.MENU DETAILS\n2.ORDER FOOD\n3.ORDER DETAILS\n4.BILL\n5.USER DETAILS\\n");
		   choice1=sc.nextInt();
		   switch (choice1) {
		   case 1:
			   d.menuDetails();
			  // break;
		   case 2:
			   d.addDetails();
			   //break;
		   case 3:
			   d.showOrderDetails();
			  // break;
		   case 4:
			   d.bill();
			  // break;
		   case 5:
			   d.dispDetails();
			   break;
			 default:
				 break;
		   }
		    
			
			
	}
}