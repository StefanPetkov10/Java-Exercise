package zad1;

public class Main {
    public static void main(String[] args) {
        DebitAccount debitAccount = new DebitAccount(100, 0.1);
        CreditAccount creditAccount = new CreditAccount(100, 0.1, 2);

        System.out.println("DebitAccount " + debitAccount.pay());
        System.out.println("CreditAccount " + Math.round(creditAccount.pay()));
    }
}
