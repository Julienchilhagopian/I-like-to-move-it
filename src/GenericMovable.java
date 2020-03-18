public class GenericMovable implements MovableObject {
    double speed;

    public GenericMovable(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean canAccelerate() {
        return true;
    }

    @Override
    public void accelerate() {
        this.speed =+ 20.00;
    }

    @Override
    public double getTimeToMove(double distance) {
        return distance * speed;
    }

    @Override
    public void brake() {
        this.speed = 0;
    }
}
