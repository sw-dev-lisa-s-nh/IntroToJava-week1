package com.lisasmith.week1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double bookPrice = 19.99;
		double totalMoneyInWallet = 40.00;
		
		int numberOfFriends = 400;
		int ageInYears = 29 + 27;
		
		char middleInitial = 'A';		
		String firstName = "Lisa";
		String lastName = "Smith";
		
		String fullName = firstName + " " + middleInitial + ". " + lastName;
		
		double moneyLeftAfterPurchase = totalMoneyInWallet - bookPrice;
		
		int friendsMadePerYear = numberOfFriends/ageInYears;
		
		System.out.println("Week 1 BESD Java Assignment");
		System.out.println(" ");
		System.out.println("     My name is " + fullName + ".");
		System.out.println(" ");
		System.out.println("     The price of a new book is $" +  bookPrice + ".");
		System.out.println("     I started the day with $" + totalMoneyInWallet + " in my wallet.");
		System.out.println("     I have $" + moneyLeftAfterPurchase + " left in my wallet "
				+  "after buying my new book.");
		System.out.println(" ");
		System.out.println("     I have " + numberOfFriends + " friends.");
		System.out.println("     I am "+ ageInYears + " years old.");	
		System.out.println("     I have made "+ friendsMadePerYear + 
				" new friends in each year of my life!");
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("End of Week 1 BESD Java Assignment");

		
		
		
		
	}

}
