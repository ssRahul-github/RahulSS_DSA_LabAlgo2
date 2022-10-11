package dsa.Traveller;

import java.util.Scanner;

public class DenominationsCalculator {
	public void minDenominations() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of currency denominations ");
	    int Denominationssize = s.nextInt();   
		int[] denomValues = new int[Denominationssize];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<Denominationssize;i++) 
			denomValues[i]=s.nextInt();
		Sorting ss = new Sorting();         
		ss.sort(denomValues);                //TO SORT THE RANDOM ARRAY
		System.out.println("enter the amount you want to pay");
		int Amount = s.nextInt();
		int[] noteCount = new int[Denominationssize];    
		for(int i = 0;i<Denominationssize;i++) {
			if(Amount>=denomValues[i]) {
				noteCount[i] = Amount/denomValues[i];  //COUNT OF MIN DENOMINATIONS 
				Amount = Amount % denomValues[i];     //REMAINING AMOUNT VALUE TO AMOUNT
			}
		}	
		s.close();
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i = 0 ;i<Denominationssize;i++) {
			if(noteCount[i]!=0) {             
			System.out.println("Dnomination value = " + denomValues[i] + " , " + " Number of notes required = " +noteCount[i]);
		}
		}
	}
}
