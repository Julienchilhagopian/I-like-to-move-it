public class ConstantSpeedMovable implements MovableObject{
    double constantSpeed;

    public ConstantSpeedMovable(double speed) {
        this.constantSpeed = speed;
    }
    @Override
    public boolean canAccelerate() {
        return false;
    }

    @Override
    public void accelerate() { }

    @Override
    public double getTimeToMove(double distance) {
        return distance * constantSpeed;
    }

    @Override
    public void brake() { }
}
