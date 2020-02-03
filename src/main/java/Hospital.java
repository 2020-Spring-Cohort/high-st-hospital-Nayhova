import java.util.HashMap;
import java.util.Map;

public class Hospital {
    public HashMap<String, Employee> hospitalRoster = new HashMap<>();
    public HashMap<String, Patient> patientRoster = new HashMap<>();

    public Map<String, Employee> gethospitalRoster() {
        return hospitalRoster;
    }

    public void hireEmployee(Employee newEmployee) {
        this.hospitalRoster.put(newEmployee.getName(), newEmployee);
    }

    public void addPatient(Patient newPatient) {
        this.patientRoster.put(newPatient.getName(), newPatient);
    }


    public void setPatientRoster(HashMap<String, Patient> patientRoster) {
        this.patientRoster = patientRoster;
    }

    public void drawBlood() {
        for (Patient pat : patientRoster.values()) {
            Patient.drawBlood();
        }
    }

    public Map<String, Patient> getpatientRoster() {
        return patientRoster;
    }

    public void treatPatient() {
        Patient.treatPatient();
    }
}





