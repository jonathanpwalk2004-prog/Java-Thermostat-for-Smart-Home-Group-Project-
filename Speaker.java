package devices;

import behavioral.DeviceSubject;
import structural.SmartDevice;

public class Doorbell extends DeviceSubject implements SmartDevice {

    private boolean ringing = false;
    private String name = "Doorbell";

    @Override
    public void turnOn() {
        ringing = true;
        notifyObservers(name + " rang!");
    }

    @Override
    public void turnOff() {
        ringing = false;
        notifyObservers(name + " is idle");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implement isOn() to track current state
    @Override
    public boolean isOn() {
        return ringing;
    }
}

