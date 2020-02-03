public class Patient {

    private static int BLOOD_LEVEL = 20;
    private static int HEALTH_LEVEL = 20;

    public static void treatPatient() {HEALTH_LEVEL -=5;}

    public int getBLOOD_LEVEL() {
        return BLOOD_LEVEL;
    }

    public void setBLOOD_LEVEL(int BLOOD_LEVEL) {
        this.BLOOD_LEVEL = BLOOD_LEVEL;
    }

    public int getHEALTH_LEVEL() {
        return HEALTH_LEVEL;
    }

    public int setHEALTH_LEVEL(int HEALTH_LEVEL) {
        this.HEALTH_LEVEL = HEALTH_LEVEL;
        return HEALTH_LEVEL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;
//    public String getName() {
//        return name;
//    }

    public Patient(String name, int BLOOD_LEVEL, int HEALTH_LEVEL){
        this.name=name;
        this.BLOOD_LEVEL=BLOOD_LEVEL;
        this.HEALTH_LEVEL=HEALTH_LEVEL;
    }


    public int setBLOOD_LEVEL() {
        return 0;
    }
    public static void drawBlood(){BLOOD_LEVEL -= 3;}
    }







