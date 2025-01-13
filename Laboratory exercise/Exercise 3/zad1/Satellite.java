public class Satellite extends SpaceObject implements Orbiter {

    public Satellite(String name, int coordinateX, int coordinateY, int coordinateZ, int mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectException {
        if (!(target instanceof Planet)) {
            throw new NotValidSpaceObjectException("A satellite can only orbit around a planet.");
        }
        ((OrbitableSpaceObject) target).addOrbiter(this);
        System.out.println(target.getName() + " is now orbiting the planet ");
    }
}