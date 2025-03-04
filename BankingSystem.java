package banking;

import util.PinValidator;
public class BankingSystem{
	public static final String storedAccountNumber="AA7891";
	public static final String storedPin="1234";

	public static class LoginProcessor{
	public static boolean authenticate(String account, String Pin){
			if(storedAccountNumber.equals(account)&& new PinValidator(). new Rules().isValid(Pin)){
				return true;
			}
			else{
				return false;
			}	
		}

	}
}