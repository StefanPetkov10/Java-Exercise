public class Main {
    public static void main(String[] args) {
        Star sun = new Star("Sun", 0, 0, 0, 100000000);
        Planet earth = new Planet("Earth", 2, 0, 0, 500000);
        Satellite moon = new Satellite("Moon", 1, 2, 0, 700000);

        try {
            earth.orbit(sun);
            moon.orbit(earth);
        } catch (NotValidSpaceObjectException e) {
            System.out.println(e.getMessage());
        }
    }
}