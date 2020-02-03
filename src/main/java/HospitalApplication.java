

import java.util.Arrays;
import java.util.Scanner;

public class HospitalApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hospital hospitalRoster = new Hospital();
        Doctor doc1 = new Doctor("Gray", 411, "Foot");
        hospitalRoster.hireEmployee(doc1);
        Nurse nrs1 = new Nurse("Nina", 215,1);
        hospitalRoster.hireEmployee(nrs1);
        Receptionist rec1 = new Receptionist("Margret", 112,true);
        hospitalRoster.hireEmployee(rec1);
        Janitor jan1 = new Janitor("Bob", 411,true);
        hospitalRoster.hireEmployee(jan1);

        Patient pat1 = new Patient("Jim",20,10);
        hospitalRoster.addPatient(pat1);

        System.out.println("Welcome to the High St Hospital\n Here is a list of our employees.");
        for (Employee name: hospitalRoster.gethospitalRoster().values()){
            System.out.println(name.getName() + " " + name.toString());

        }
        System.out.println("Please indicate how you would like to proceed.\n"+
        "1. Draw Blood\n"+
        "2. Treat a patient\n");
        int interactMenuChoice = input.nextInt();
        switch (interactMenuChoice){
            case 1:
                hospitalRoster.drawBlood();
                System.out.println(pat1.getName());
                System.out.println(pat1.getBLOOD_LEVEL());
                break;
            case 2:
                hospitalRoster.treatPatient();
                System.out.println(pat1.getName());
                System.out.println(pat1.getHEALTH_LEVEL());
                break;
            }
        }}

