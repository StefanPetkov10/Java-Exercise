public abstract class BaseBuilding {

    private String name;
    private int level;
    private int constructionTime;
    private double metalRequired;
    private double crystalRequired;
    private double gasRequired;
    private double uraniumRequired;

    public BaseBuilding(String name, int level, int constructionTime, double metalRequired, double crystalRequired, double gasRequired, double uraniumRequired) {
        this.name = name;
        this.level = level;
        this.constructionTime = constructionTime;
        this.metalRequired = metalRequired;
        this.crystalRequired = crystalRequired;
        this.gasRequired = gasRequired;
        this.uraniumRequired = uraniumRequired;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getConstructionTime() {
        return constructionTime;
    }

    public double getMetalRequired() {
        return metalRequired;
    }

    public double getCrystalRequired() {
        return crystalRequired;
    }

    public double getGasRequired() {
        return gasRequired;
    }

    public double getUraniumRequired() {
        return uraniumRequired;
    }


    public boolean construct(Planet target) {
        if (target.getMetal().getAmount() >= metalRequired &&
                target.getCrystal().getAmount() >= crystalRequired &&
                target.getGas().getAmount() >= gasRequired &&
                target.getUranium().getAmount() >= uraniumRequired) {
            System.out.println("Construction of " + name + " on planet started. Time required: " + constructionTime + " units.");
            applyEffect(target);
            return true;
        } else {
            System.out.println("Insufficient resources to construct " + name);
            return false;
        }
    }

    public void upgrade() {
        level++;
        metalRequired *= 2;
        crystalRequired *= 2;
        gasRequired *= 2;
        uraniumRequired *= 2;
        System.out.println(name + " upgraded to level " + level);
    }

    public void applyEffect(Planet target) {
        System.out.println("Applying base effect of " + target.getName());
    }
}

