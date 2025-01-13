public class Resource {

    private double amount;
    private double harvestRate;

    public Resource(double amount, double harvestRate){
        this.amount = amount;
        this.harvestRate = harvestRate;
    }

    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getHarvestRate(){
        return harvestRate;
    }
    public void setHarvestRate(double harvestRate){
        this.harvestRate = harvestRate;
    }

    public void harvest(){
        amount += harvestRate;
    }

    public void harvestUpgrade(double multiplier){
        harvestRate *= multiplier;
    }
}
