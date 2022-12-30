package myException;

public class ThrowMain {

    public static void main(String[] args) throws Exception {


        AccountManeger maneger = new AccountManeger();
        System.out.println("Hesap = " + maneger.getBalance());
        maneger.deposit(100);
        System.out.println("Hesap = " + maneger.getBalance());
        try {
            maneger.withdraw(90);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap = " + maneger.getBalance());
        try {
            maneger.withdraw(20);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap = " + maneger.getBalance());




    }

}
