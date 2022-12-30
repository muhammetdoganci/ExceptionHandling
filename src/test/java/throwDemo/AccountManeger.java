package throwDemo;

public class AccountManeger {

    private double balance;  //hesaptaki para miktari degiskeni

    public void deposit(double amount){
        balance = getBalance() + amount; //hesaba para yatirma
    }

    public void  withdraw(double amount) throws Exception {
        /*
        if (balance>=amount){
            balance = getBalance() - amount; // hesaptan para cekme
        }else {
            System.out.println("Hesaptan para cekilemedi. Bakiye yetersiz");
        }
        */
        if (balance>=amount){
            balance = getBalance() - amount; // hesaptan para cekme
        }else {
            throw new Exception("Bakiye yetersiz");
        }

    }


    public double getBalance() {
        return balance;
    }
}
