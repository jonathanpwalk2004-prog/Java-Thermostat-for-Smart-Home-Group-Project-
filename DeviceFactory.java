package behavioral;

/**
 * Observer interface for the Observer design pattern
 *
 * This interface defines the contract for objects that receive notifications
 * when SmartDevice state changes occur in the Smart Home Automation System.
 *
 * <p><strong>Usage:</strong></p>
 * <ul>
 *   <li>MainGUI receives real-time device updates</li>
 *   <li>CentralController monitors system changes</li>
 * </ul>
 *
 * <p><strong>Pattern Benefits:</strong></p>
 * <ul>
 *   <li>Real-time notifications</li>
 *   <li>Loose coupling</li>
 *   <li>Easy to add new observers</li>
 * </ul>
 *
 * @author Sathya-om Ramdass
 * @author Jonathan Walkes
 * @version 1.0
 * @since 2025-11-14
 * @see structural.SmartDevice
 * @see controller.CentralController
 */
public interface Observer {

    /**
     * Receives notification when a SmartDevice state changes
     *
     * <p>Called automatically by SmartDevices when events occur:
     * <ul>
     *   <li>Device turned ON/OFF</li>
     *   <li>Temperature changed</li>
     *   <li>Volume adjusted</li>
     * </ul>
     *
     * <p><strong>Example Implementation:</strong></p>
     * <pre>
     * Observer guiObserver = (message) ->
     *     txtLog.append(message + "\n");
     * </pre>
     *
     * @param message Notification message (e.g., "Light 1 turned ON")
     */
    void update(String message);
}