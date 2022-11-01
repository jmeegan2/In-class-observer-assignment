public class Gates implements AlarmListener{
    @Override
    public void alarm() {
        AlarmListener.super.alarm();
        System.out.println("gates close");
    }
}
