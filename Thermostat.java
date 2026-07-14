package devices;

import behavioral.DeviceSubject;
import structural.SmartDevice;

public class Light extends DeviceSubject implements SmartDevice {

    private boolean isOn = false;
    private String name = "Light"; // field to store device name

    @Override
    public void turnOn() {
        isOn = true;
        notifyObservers(name + " turned ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        notifyObservers(name + " turned OFF");
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
        return isOn;
    }
}


