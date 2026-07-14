package devices;

import behavioral.DeviceSubject;
import structural.SmartDevice;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a room that can contain multiple smart devices.
 * Implements the <strong>Composite</strong> design pattern.
 *
 * <p>A Room acts both as a container and as a SmartDevice itself.
 * You can turn on/off all devices in the room at once, set room temperature
 * (which affects any thermostat inside), and receive unified notifications.</p>
 *
 * @author Sathya-om Ramdass
 * @author Jonathan Walkes
 * @version 1.0
 * @since 2025-11-14
 */
public class RoomComposite extends DeviceSubject implements SmartDevice {

    private final String name;
    private final List<SmartDevice> devices = new ArrayList<>();
    private int roomTemperature = 22; // default comfortable temperature

    /**
     * Creates a new room with the given name.
     *
     * @param name name of the room (e.g., "Living Room", "Bedroom")
     */
    public RoomComposite(String name) {
        this.name = name;
    }

    /** Adds a device to this room and forwards its notifications with room prefix */
    public void addDevice(SmartDevice device) {
        devices.add(device);
        device.registerObserver(msg -> notifyObservers(name + ": " + msg));
    }

    /** Removes a device from this room */
    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    /** Turns on every device in the room */
    @Override
    public void turnOn() {
        notifyObservers(name + " turning ON all devices...");
        for (SmartDevice d : devices) {
            d.turnOn();
        }
    }

    /** Turns off every device in the room */
    @Override
    public void turnOff() {
        notifyObservers(name + " turning OFF all devices...");
        for (SmartDevice d : devices) {
            d.turnOff();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    /** A room is considered "on" if at least one device is on */
    @Override
    public boolean isOn() {
        return devices.stream().anyMatch(SmartDevice::isOn);
    }

    /** Sets desired temperature — automatically updates any thermostat in the room */
    public void setRoomTemperature(int temp) {
        this.roomTemperature = temp;
        for (SmartDevice d : devices) {
            if (d instanceof Thermostat thermostat) {
                thermostat.setTemperature(temp);
            }
        }
        notifyObservers("Room temperature set to " + temp + "°C");
    }

    public int getRoomTemperature() {
        return roomTemperature;
    }

    public boolean hasThermostat() {
        return devices.stream().anyMatch(d -> d instanceof Thermostat);
    }

    public boolean isAnyThermostatOn() {
        return devices.stream().anyMatch(d -> d instanceof Thermostat && d.isOn());
    }

    /** Returns the first speaker found in the room (or null if none) */
    public Speaker getFirstSpeaker() {
        for (SmartDevice d : devices) {
            if (d instanceof Speaker speaker) {
                return speaker;
            }
        }
        return null;
    }
}

