public interface AlarmListener {
    default void alarm(){
        System.out.println("Alarm is sounding!!!!!!");;
    }
}
