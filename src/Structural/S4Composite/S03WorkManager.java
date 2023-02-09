package Structural.S4Composite;

import java.util.ArrayList;
import java.util.List;

// Composite class
public class S03WorkManager implements S01Worker {

    private List<S02aHuman> humanEmployees = new ArrayList<>();
    private List<S02bRobot> robotEmployees = new ArrayList<>();

    public void add(S01Worker worker) {
        if (worker.getClass().getName().equalsIgnoreCase("human")) {
            this.humanEmployees.add((S02aHuman) worker);
        } else {
            robotEmployees.add((S02bRobot) worker);
        }
    }

    public void remove(S01Worker worker) {
        if (worker.getClass().getName().equalsIgnoreCase("human")) {
            this.humanEmployees.remove((S02aHuman) worker);
        } else {
            robotEmployees.remove((S02bRobot) worker);
        }
    }

    @Override
    public String toString() {
        return "S03WorkManager{" +
                "humanEmployees are =" + humanEmployees +
                ", robotEmployees are=" + robotEmployees +
                '}';
    }

    @Override
    public void performTask() {
        System.out.println(getClass().getName() + "performing a task!");
    }
}
