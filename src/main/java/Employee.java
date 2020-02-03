public abstract class Employee {

    protected int salary;
    private String name;
    private int id;
    private boolean hasBeenPaid = false;

    public Employee() {
    }

    public Employee(String name, int id) {

    }


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", hasBeenPaid=" + hasBeenPaid +
                '}';
    }
    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }


    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isHasBeenPaid() {
        return hasBeenPaid;
    }

    public void setHasBeenPaid(boolean hasBeenPaid) {
        this.hasBeenPaid = hasBeenPaid;
    }

}
