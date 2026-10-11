 class bank_ac {
    String Ac_holder_name;
    int balance;

    void transfer(bank_ac receiver, int  amount) {
        if (balance >= amount) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
        }
    }
}
public class bank{
    public static void main(String[] args) {
        bank_ac a1 = new bank_ac();
        bank_ac a2 = new bank_ac();

        a1.balance = 20000;
        a2.balance = 15000;

        a1.transfer(a2, 5000);
        

        System.out.println("\nFinal Balances:");
        System.out.println("a1 balance: " + a1.balance);
        
    }
}
 

