public class Lighting implements AlarmListener{
    @Override
    public void alarm() {
        AlarmListener.super.alarm();
        System.out.println("Lights up");
    }
}
