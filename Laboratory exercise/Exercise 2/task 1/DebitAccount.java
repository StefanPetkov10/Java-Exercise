package zad1;

public class DebitAccount extends BankAccount{

    public DebitAccount(double sum, double interest)
    {
        super (sum, interest);
    }

    @Override
    public double pay() {
        return getSum() * getInterest();
    }
}

