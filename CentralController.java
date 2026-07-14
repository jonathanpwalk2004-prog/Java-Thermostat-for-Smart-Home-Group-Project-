package behavioral;

import java.util.ArrayList;
import java.util.List;

/**
 * DeviceSubject implements the Subject role in Observer pattern
 * 
 * Manages observer registration and notifications for Smart Home devices.
 * 
 * <p><strong>Key Methods:</strong></p>
 * <ul>
 *   <li>{@link #registerObserver(Observer)} - Add observer</li>
 *   <li>{@link #notifyObservers(String)} - Broadcast notifications</li>
 * </ul>
 * 
 * @author Sathya-om Ramdass
 * @author Jonathan Walkes
 * @version 1.0
 * @since 2025-11-14
 * @see behavioral.Observer
 * @see structural.SmartDevice
 */
public class DeviceSubject {
    private List<Observer> observers = new ArrayList<>();
    
    /**
     * Register observer for notifications
     * @param obs Observer to register
     */
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }
    
    /**
     * Notify all observers of state change
     * @param message Notification message
     */
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
