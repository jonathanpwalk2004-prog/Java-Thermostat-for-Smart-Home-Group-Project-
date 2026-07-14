package devices;

import behavioral.DeviceSubject;
import structural.SmartDevice;

public class Camera extends DeviceSubject implements SmartDevice {

    private boolean recording = false;
    private String name = "Camera";

    @Override
    public void turnOn() {
        recording = true;
        notifyObservers(name + " started recording");
    }

    @Override
    public void turnOff() {
        recording = false;
        notifyObservers(name + " stopped recording");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean isOn() {
        return recording;
    }
}


