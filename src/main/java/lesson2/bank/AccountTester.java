package lesson2.bank;

public class AccountTester {

    public static void main(String[] args) {
        Account timmyAccount = new Account("1", "Timmy", 100);
        Account lolaAccount = new Account("2", "Lola", 30);

        timmyAccount.transfer(lolaAccount, 50);
        System.out.println(lolaAccount.transfer(timmyAccount, 50));
    }
}
