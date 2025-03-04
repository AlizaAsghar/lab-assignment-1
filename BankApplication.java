package main;
import banking.BankingSystem;
import java.io.Console;

public class BankApplication{
	public static void main(String[] args){
		Console console=System.console();
		String account=console.readLine("Enter Account Number: ");
		String pin=console.readLine("Enter Account Password: ");
		
		boolean Authentic=BankingSystem.LoginProcessor.authenticate(account,pin);
		if(Authentic){
			System.out.println("You have successfully logged in!");
		}
		else
			System.out.println("Incorrect account number or account pin");
		
	}	
}