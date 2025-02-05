package com.crm.sample;

public class MyFamily {
   public void Father() {
	   System.out.println("Father name is = Sanjeeb Kumar Pradhan");
   }
   public void Mother() {
	   System.out.println("Mother name is = Jayanti Mani Nayak");
   }
   public void Sister() {
	   System.out.println("Sister name is = Swagatika Pradhan"); 
   }
   public void Son() {
	   System.out.println("ama mothfk millionaire"); 
   }
   public static void main(String[] args) {
	 System.out.println("WELCOME TO PRADHAN FAMILY");
	 System.out.println("-------------------------------");
	 MyFamily mf = new MyFamily();
	 mf.Father();
	 mf.Mother();
	 mf.Sister();
	 mf.Son();
	 System.out.println("----------------THE END---------------");
	 System.out.println("THANK YOU");
   }
}
