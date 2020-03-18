public class MovableUser {
    public static void main(String[] args) {
        MovableObject constantSpeedObj = new ConstantSpeedMovable(50);
        MovableObject genericMovable1 = new GenericMovable(100);
        MovableObject genericMovable2 = new GenericMovable(150);
        MovableUser user = new MovableUser();

        System.out.println("Total time constantSpeedObj " + user.getTotalTime(constantSpeedObj));
        System.out.println("Total time genericMovable1 " + user.getTotalTime(genericMovable1));
        System.out.println("Total time genericMovable2 " + user.getTotalTime(genericMovable2));

    }

    private double getTotalTime(MovableObject movable) {
        double totalTime = 0.00;

        totalTime += movable.getTimeToMove(1);
        movable.brake();
        totalTime += movable.getTimeToMove(0.1); // movable at brake so should return 0
        movable.accelerate();
        totalTime += movable.getTimeToMove(1);

        return totalTime;
    }
}
