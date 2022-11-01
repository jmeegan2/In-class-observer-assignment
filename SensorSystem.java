import java.util.ArrayList;

public class SensorSystem {
    //This is the publisher class

    //instance variable

    //Saves all the observers of this publisher
    ArrayList< AlarmListener > listeners = new ArrayList();

    void register(AlarmListener alarmListener) {
        listeners.add(alarmListener);
    }

    void soundTheAlarm() {
        //loop through all the listeners/observers in the ArrayList
        for(int i = 0; i < listeners.size(); i++) {
            listeners.get(i).alarm();

        }
    }

    public static void main(String[] args) {

    }
}
