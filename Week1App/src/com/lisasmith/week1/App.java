package com.lisasmith.week1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assignment Requirement 3
		// 3 (a.) Item Price
		double priceOfHardcoverBook = 19.50;
		double priceOfLatte = 5.75; 
		
		// 3 (b.) Amount of money in wallet
		double weeklySpendingMoney = 40.00;	
		double budgetForCoffee = 20.00;
		
		// 3 (c.) Number of Friends
		int numOfFacebookFriends = 1000;	
		int numOfRealFriends = 400;
		
		// 3 (d.) Age in years (as a whole number)
		int ageInYears = 25;
		int studentAgeInYears = 18;	
		int studentYearsOnFacebook = studentAgeInYears - 13; 

		// 3 (e.) First Name
		String firstName = "Rebekah";
		String studentFirstName = "John";
		
		// 3 (f.) Last Name Variables
		String lastName = "Smith";
		String studentLastName = "Student";
			
		// 3 (g.) Middle Initial 
		char middleInitial = 'P';		
		char studentMiddleInitial = 'Q';
		
		
		// Assignment Requirement 4
		// 4 (c.) Full Name Variables
		String fullName = firstName + " " + middleInitial + ". " 
				+ lastName;
		String studentFullName = studentFirstName + " " 
				+ studentMiddleInitial + ". " + studentLastName;
	
		//4 (a.) Amount of Money Variables;
		double remainingSpendingMoney = weeklySpendingMoney - priceOfHardcoverBook;
		double remainingCoffeeMoney = budgetForCoffee - priceOfLatte; 
	
		//4 (b.) Number of Friends Variables
		int avgNumOfRealFriends = numOfRealFriends/ageInYears;		
		int avgNumOfFacebookFriends = numOfFacebookFriends/studentYearsOnFacebook;
		
		
		//5 Printing all created variables!
		System.out.println(" ");
		// (a.) Amount of Money After Purchase Variables
		System.out.println(firstName + " started the week with $" 
				+ String.format ("%.2f", weeklySpendingMoney) + ".");
		System.out.println("The price of a new hard cover book is $" 
				+ String.format ("%.2f", priceOfHardcoverBook) + ".");
		
		System.out.println(firstName + " has $" 
				+ String.format ("%.2f", remainingSpendingMoney) + " left "
				+  "after buying one book.");
		System.out.println(" ");
		
		System.out.println(studentFirstName + " has a weekly coffee budget of $" 
				+ String.format ("%.2f", budgetForCoffee) + ".");
		
		System.out.println("The price of a latte is $" 
				+ String.format ("%.2f", priceOfLatte) + ".");	
		System.out.println(studentFirstName + " has $" 
				+ String.format ("%.2f", remainingCoffeeMoney) 
				+ " left in his wallet after buying a latte." );
		System.out.println(" ");
	
		// (b.) Average Number of Friends Made Per Year Variables
		System.out.println(firstName + " has " + numOfRealFriends + " friends.");
		System.out.println(firstName + " is "+ ageInYears + " years old.");	
		System.out.println(firstName + " has made an average of "
				+ avgNumOfRealFriends + " new friends each year.");
		System.out.println(" ");
		
		System.out.println(studentFirstName + " has " 
				+ numOfFacebookFriends + " Facebook friends.");
		System.out.println(studentFirstName + " is "
				+ studentAgeInYears + " years old.");	
		System.out.println("In his " + studentYearsOnFacebook 
				+ " years on Facebook, " + studentFirstName + " has made an average of "
				+ avgNumOfFacebookFriends + " friends each year.");
		System.out.println(" ");
		
		// (c.) Full Name Variables
		System.out.println("My daughter's name is " + fullName + ".");		
		System.out.println(studentFullName + " is the newest addition to our class.");				
		
	}

}
