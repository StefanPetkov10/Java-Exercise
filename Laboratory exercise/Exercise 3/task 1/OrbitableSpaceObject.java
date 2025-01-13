import java.util.ArrayList;
import java.util.List;

public abstract class OrbitableSpaceObject extends SpaceObject {

    private List<SpaceObject> orbiters = new ArrayList<SpaceObject>();

    public OrbitableSpaceObject(String name, int coordinateX, int coordinateY, int coordinateZ, int mass)
    {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.orbiters = orbiters;
    }

    public void addOrbiter(SpaceObject orbiter) {
        orbiters.add(orbiter);
    }

    public List<SpaceObject> getOrbiters() {
        return orbiters;
    }

}
