public class MetalMine extends BaseBuilding {
    public MetalMine() {
        super("Metal Mine", 1, 5, 100, 50, 20, 10);
    }

    @Override
    public void applyEffect(Planet target) {
        target.upgradeMetalHarvest();
        System.out.println("Metal Mine effect applied: Metal harvest rate increased.");
    }
}