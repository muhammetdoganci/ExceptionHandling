package myException;

public class AccountManeger {

    private double balance;  //hesaptaki para miktari degiskeni

    public void deposit(double amount){
        balance = getBalance() + amount; //hesaba para yatirma
    }

    public void  withdraw(double amount) throws BalanceInsufficentException {

        if (balance>=amount){
            balance = getBalance() - amount; // hesaptan para cekme
        }else {
            throw new BalanceInsufficentException("Bakiye yetersiz");
        }

    }


    public double getBalance() {
        return balance;
    }
}
