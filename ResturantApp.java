package Resturaunt;

import java.util.Scanner;

class hotelNmae{
	public void hotelName()
	{
		 System.out.println("-----------------------------------------");
		System.out.println(" \u001B[36m        WELCOMR TO Zen & Out");
		System.out.print("\u001B[37m");
		 System.out.println("-----------------------------------------");
	
		System.out.println("-----------------------------------------");
		String gstno="29CCFPJ5209A19Z8";
		System.out.println("GST number : "+gstno);
		System.out.println("-----------------------------------------");
	}
}
class DetailsOfCustomer extends Thread{
	String name;
	   int age;
	   long phno;
	   String a,b,c,d;
	   int count=0,count1=0,count2=0,count3=0,count4=0,count5;
	   int choice,choice1;
	   int ss,ss1,ss2,ss3;
	  String ans;
	  
	  float gst;
	  float bill,bill1,s,b1,b2,b3,b4,b5;
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
		   System.out.println("Please provide your details");
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
    	   System.out.println("Enter your choice of food:");
           choice=sc.nextInt();
           switch (choice) {
           
           case 1:
        	   a=s1;
        	   System.out.println("YOUR ORDER IS :"+a);
        	   System.out.println("Enter total plate:");
        	   count1+=sc.nextInt();
        	   System.out.println("Total plate"+" "+count1);
        	   ss=1;
        		break;
		     case 2:
        	   b=s2;
        	   System.out.println("YOUR ORDER IS :"+b);
        	   System.out.println("Enter total plate");
        	   count2+=sc.nextInt();
        	   System.out.println("Total plate"+" "+count2);
        	  ss1=1;
          		break;
		case 3:
        	   c=s3;
        	   System.out.println("YOUR ORDER IS :"+c);
        	   System.out.println("Enter total plate:");
        	   count3+=sc.nextInt();
        	   System.out.println("Total plate"+" "+count3);
        	   ss2=1;
        	   break;
           case 4:
        	   d=s4;
        	   System.out.println("YOUR ORDER IS :"+d);
        	   System.out.println("Enter total plate:");
        	   count4+=sc.nextInt();
        	   System.out.println("Total plate"+" "+count4);
        	   ss3=1;
        	   break;
        	default: 
        		System.out.println("Item not found");
        		break;
           }
          
			  }
			  else{
				  System.out.print("\u001B[37m");
				  System.out.println("\u001B[31mTHANK YOU ");
				 System.out.print("\u001B[37m");
				return; 
			  }
			  count=count1+count2+count3+count4;
		  }while(ans.equalsIgnoreCase("y"));
	  }
	   void showOrderDetails() {
		   System.out.println("DO YOU WISH TO CONTINUE FOR BILL(y/n)");
	          ans=sc.next().toLowerCase();
			  if(ans.equalsIgnoreCase("y")) {
			   count5=count+count1+count2+count3+count4;
	   }		
				  else {
					  addDetails();
				  }
			  }
	   public void foodPrepare() {
		   System.out.println("FOOD IS PREPARING");
	   }
	   public void foodReady() {
		   System.out.println("FOOD IS READY AND SERVED");
	   }
	   
	   public void bill() {
		  
		   System.out.println("----------------------------------------------------------------------------------------------");
		   System.out.println("YOUR BILL IS ");
		   s=count1;
		   b1=count2;
		   b2=count3;
		   b4=count4;
		   bill=s*f1+b1*f2+b2*f3+b4*f4;
		  // dispDetails();
		   System.out.println("----------------------------------------------------------------------------------------------");

			System.out.println("Bill amount without gst is "+bill);
				
				b5=(bill+(bill*9.00f/100));
				bill1=(bill*9.00f/100)+b5;
				System.out.println("Bill amount with 9% cgst is "+b5);
				System.out.println("Bill amount with 9% sgst is "+bill1);
				 System.out.println("----------------------------------------------------------------------------------------------");

				   System.out.println("\u001B[32m                THANK YOU VISIT AGAIN");
				   System.out.print("\u001B[37m");
			  
	   }
	   void dispDetails() {
		   System.out.println("----------------------------------------------------------------------------------------------");
		   System.out.println("Customer details");
		   System.out.println("Customer name is "+name);
		   System.out.println("Customer age is "+age);
		   System.out.println("Customer phno is "+phno);
		   System.out.println("----------------------------------------------------------------------------------------------");

	   }
}
public class ResturantApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		hotelNmae h=new hotelNmae();
		h.hotelName();
		DetailsOfCustomer d= new DetailsOfCustomer();
		  d.details();
		int choice1;
		 System.out.println("enter your choice");
		   System.out.println("1.MENU DETAILS\n2.ORDER FOOD\n3.ORDER DETAILS\n4.BILL");
		   choice1=sc.nextInt();
		   switch (choice1) {
		   case 1:
			   d.menuDetails();
		   case 2:
			   d.addDetails();
			   try {Thread.sleep(1000);}catch(InterruptedException e) {System.out.println(e.getLocalizedMessage());}
			   d.foodPrepare();
			   try {Thread.sleep(2700);}catch(InterruptedException e) {System.out.println(e.getLocalizedMessage());}
                d.foodReady();
 			   try {Thread.sleep(3500);}catch(InterruptedException e) {System.out.println(e.getLocalizedMessage());}
		   case 3:
			   d.showOrderDetails();
		   case 4:
			   d.bill();
			 default:
				 break;
		   }
			
	}
}
