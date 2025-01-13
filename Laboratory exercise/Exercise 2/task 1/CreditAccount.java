package zad1;

public class CreditAccount extends BankAccount{

    private int mounts;

    public CreditAccount(double sum, double interest, int mounts)
    {
        super (sum, interest);
        this.mounts = mounts;
    }

    public int getMounts(){
        return mounts;
    }
    public void setMounts(){
        this.mounts = mounts;
    }

    @Override
    public double pay() {
        return getSum() * Math.pow(1 + getInterest(), mounts) - getSum();
    }
}
