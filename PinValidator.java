package util;  
import banking.BankingSystem;

public class PinValidator {
    public class Rules {
        public boolean isValid(String pin) {
            if (pin.length() == 4 && pin.matches("\\d{4}") && pin.equals(BankingSystem.storedPin)) {
                return true;
            }
            return false; 
        }
    }
}
