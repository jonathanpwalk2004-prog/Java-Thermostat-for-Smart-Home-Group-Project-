package creational;

import devices.*;
import structural.SmartDevice;

/**
 * DeviceFactory implements the Factory design pattern
 *
 * <p>Creates different types of SmartDevice instances based on a string parameter.
 * This centralizes device creation and makes it easy to add new device types.</p>
 *
 * <h2>Supported Device Types</h2>
 * <ul>
 *   <li><code>"light"</code> → {@link devices.Light} (Smart lighting control)</li>
 *   <li><code>"fan"</code> → {@link devices.OldFanAdapter} (Legacy fan integration)</li>
 *   <li><code>"doorbell"</code> → {@link devices.Doorbell} (Smart doorbell)</li>
 *   <li><code>"thermostat"</code> → {@link devices.Thermostat} (Temperature control)</li>
 *   <li><code>"speaker"</code> → {@link devices.Speaker} (Smart audio system)</li>
 *   <li><code>"camera"</code> → {@link devices.Camera} (Security camera)</li>
 * </ul>
 *
 * <h2>Usage Example</h2>
 * <pre>
 * SmartDevice light = DeviceFactory.createDevice("light");
 * SmartDevice thermostat = DeviceFactory.createDevice("thermostat");
 * </pre>
 *
 * <h2>Factory Pattern Benefits</h2>
 * <ul>
 *   <li>Centralized creation logic</li>
 *   <li>Easy to extend with new device types</li>
 *   <li>All devices conform to {@link SmartDevice} interface</li>
 *   <li>Invalid types throw {@link IllegalArgumentException}</li>
 * </ul>
 *
 * @author Sathya-om Ramdass
 * @author Jonathan Walkes
 * @version 1.0
 * @since 2025-11-14
 */
public class DeviceFactory {

    /**
     * Creates a SmartDevice instance based on the specified type.
     *
     * <p>Case-insensitive matching is used. Unknown types result in an exception.</p>
     *
     * @param type the device type as a string (e.g., "light", "fan")
     * @return a new SmartDevice instance
     * @throws IllegalArgumentException if the type is not recognized
     */
    public static SmartDevice createDevice(String type) {
        return switch (type.toLowerCase()) {
            case "light"       -> new Light();
            case "fan"         -> new OldFanAdapter();
            case "doorbell"    -> new Doorbell();
            case "thermostat"  -> new Thermostat("Thermostat");
            case "speaker"     -> new Speaker();
            case "camera"      -> new Camera();
            default            -> throw new IllegalArgumentException("Unknown device type: " + type);
        };
    }
}


