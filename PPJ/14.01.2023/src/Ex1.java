public class Ex1 {
    public static void main(String[] args) throws Alarm {
        DetektorDymu d = new DetektorDymu();
        d.sprawdz(true);
    }
}

class Alarm extends Exception {
    public Alarm(String msg) {
        super(msg);
    }
}

class DetektorDymu {
    public void sprawdz(boolean czySiePali) throws Alarm {
        if (czySiePali) {
            throw new Alarm("Dym!");
        }
    }
}