package devices;

import behavioral.DeviceSubject;
import structural.SmartDevice;

public class Speaker extends DeviceSubject implements SmartDevice {

    private boolean playing = false;
    private String name = "Speaker";
    private int volume = 50; // default volume

    @Override
    public void turnOn() {
        playing = true;
        notifyObservers(name + " started playing music");
    }

    @Override
    public void turnOff() {
        playing = false;
        notifyObservers(name + " stopped playing music");
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
        return playing;
    }

    public int getVolume() {
        return volume;
    }

public void setVolume(int volume) {
    this.volume = volume;
    notifyObservers(name + " volume set to " + volume + "%");
}

}

