import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class EmployeeTest {

    @Test
    public void getBloodLevel(){
        Patient underTest = new Patient("bob",20,10);
        int BLOOD_LEVEL = underTest.getBLOOD_LEVEL();
        assertEquals(20, BLOOD_LEVEL);
    }
    @Test
    public void setBloodLevel(){
        Patient underTest = new Patient("bob",20,10);
        int BLOOD_LEVEL = underTest.setBLOOD_LEVEL();
    }
    @Test
    public void getHealth(){
        Patient underTest = new Patient("bob",20,10);
        int HEALTH_LEVEL = underTest.getHEALTH_LEVEL();
        assertEquals(10, HEALTH_LEVEL);
    }
    @Test
    public void setHealthLevel(){
        Patient underTest = new Patient("bob",20,10);
        int HEALTH_LEVEL = underTest.setHEALTH_LEVEL(10);
    }

    }



