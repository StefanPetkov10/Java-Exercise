public class Planet extends OrbitableSpaceObject implements Orbiter {

    public double multiplier = 2;

    private Metal metal;
    private Gas gas;
    private Crystal crystal;
    private Uranium uranium;

    public Planet(String name, int coordinateX, int coordinateY, int coordinateZ, int mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);

    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }
    public Metal getMetal() {
        return metal;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }
    public Gas getGas() {
        return gas;
    }

    public void setCrystal(Crystal crystal) {
        this.crystal = crystal;
    }
    public Crystal getCrystal() {
        return crystal;
    }

    public void setUranium(Uranium uranium) {
        this.uranium = uranium;
    }
    public Uranium getUranium() {
        return uranium;
    }

    public void harvestMetal() {
        metal.harvest();
    }

    public void harvestGas() {
        gas.harvest();
    }

    public void harvestCrystal() {
        crystal.harvest();
    }

    public void harvestUranium() {
        uranium.harvest();
    }

    public void printResources() {
        System.out.println("Metal: " + metal.getAmount());
        System.out.println("Gas: " + gas.getAmount());
        System.out.println("Crystal: " + crystal.getAmount());
        System.out.println("Uranium: " + uranium.getAmount());
    }

    public void upgradeMetalHarvest() {
        metal.harvestUpgrade(multiplier);
    }
    public void upgradeGasHarvest() {
        gas.harvestUpgrade(multiplier);
    }
    public void upgradeCrystalHarvest() {
        crystal.harvestUpgrade(multiplier);
    }
    public void upgradeUraniumHarvest() {
        uranium.harvestUpgrade(multiplier);
    }

    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectException {
        if (target instanceof Star) {
            System.out.println("Planet " + getName() + " orbits around " + target.getName());
        } else {
            throw new NotValidSpaceObjectException("Planet can only orbit around a star.");
        }
    }
}
