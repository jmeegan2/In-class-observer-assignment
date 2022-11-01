public class Surveillance implements AlarmListener {
    @Override
    public void alarm() {
        AlarmListener.super.alarm();
        System.out.println("Surveillance - by the numbers: ");
    }
}
