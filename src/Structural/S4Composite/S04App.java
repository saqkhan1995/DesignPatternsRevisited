package Structural.S4Composite;

public class S04App {
    public static void main(String[] args) {
        S02aHuman human = new S02aHuman();
        human.setName("John");
        human.setDepartment("HR");

        S02bRobot robot = new S02bRobot();
        robot.setName("R2D2");
        robot.setDepartment("Manufacturing");

        S03WorkManager workManager = new S03WorkManager();
        workManager.add(human);
        workManager.add(robot);
        System.out.println(workManager);
    }
}
