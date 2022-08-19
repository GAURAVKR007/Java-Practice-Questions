class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message){
        super(message);
    }
}


public class User_defined_Exception {
    public static void main(String[] args) {
        try {
        int balance;
        balance = Integer.parseInt(args[0]);

            updateBalance(balance);
        }catch(InvalidBalanceException e){
            System.out.println("Caught in catch of InvalidBalanceException");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught in catch of ArrayIndexOutOfBoundsException");
        }catch(Exception e){
            System.out.println("Caught in catch of Exception");
        }
    }

    public static void updateBalance(int number) throws InvalidBalanceException {
        if(number < 0){
            throw new InvalidBalanceException("Account balance cannot be less than zero.");
        }
        System.out.println("No Exception occurred in updateBalance() Method");
    }
}
