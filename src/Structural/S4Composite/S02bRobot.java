package Structural.S4Composite;

public class S02bRobot implements S01Worker {

    private String name;
    private String department;

    @Override
    public void performTask() {
        System.out.println(getClass().getName() + " performing the task.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Robot" +
                "name='" + name + '\'' +
                ", from='" + department + '\'' +
                '}';
    }
}
