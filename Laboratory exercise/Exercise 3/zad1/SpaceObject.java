public abstract class SpaceObject {

    private String name;
    private int coordinateX;
    private int coordinateY;
    private int coordinateZ;
    private int mass;

    public SpaceObject(String name, int coordinateX, int coordinateY, int coordinateZ, int mass) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCoordinateX() {
        return coordinateX;
    }
    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }
    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public int getCoordinateZ() {
        return coordinateZ;
    }
    public void setCoordinateZ(int coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    public int getMass() {
        return mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }


    public void displayInfo() {

    }

}
