package zad1;

public abstract class BankAccount {

    private double sum;
    private double interest;

    public BankAccount(double sum, double interest){
        this.sum = sum;
        this.interest = interest;
    }

    public abstract double pay();

    public double getSum(){
        return sum;
    }
    public void setSum(){
        this.sum = sum;
    }

    public double getInterest(){
        return interest;
    }
    public void setInterest(){
        this.interest = interest;
    }
}
