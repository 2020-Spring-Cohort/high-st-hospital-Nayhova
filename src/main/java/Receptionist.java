public class Receptionist extends Employee {

    public boolean onPhone;
    public void answeringPhone(){
        onPhone ^=true;
    }

    public Receptionist(String name, int id, boolean onPhone) {
        super(name, id, 45000);
    }
    }

