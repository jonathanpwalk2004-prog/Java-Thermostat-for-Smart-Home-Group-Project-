SMART HOME AUTOMATION SYSTEM
===================================================================================



1. SYSTEM REQUIREMENTS:
===================================================================================

• Java JDK 24 or newer (recommended)
• NetBeans IDE 18 or newer (optional)
• Works on Windows, Mac, and Linux
If you are using a JDK older than version 24, see the compatibility note at the bottom.


3. HOW TO RUN THE APPLICATION
===================================================================================

***Running in NetBeans:***
1. Open NetBeans.
2. Go to File > Open Project.
3. Select the SmartHomeSystem folder.
4. Press F6 or click Run Project.
5. The Smart Home Automation GUI will appear.

***Running without NetBeans***
1. Go to the dist folder.
2. Double-click SmartHomeSystem.jar
   (Java must be installed — double-clicking works instantly on most computers)


3. USING THE APPLICATION
===================================================================================

***Creating Devices:***
1. Select a device type from the dropdown (light, fan, doorbell, thermostat, speaker, camera).
2. Click "Create Device".
3. The device appears in the left list.
4. To delete: select device → click "Delete Device".

***Creating Rooms:***
1. Click "Create Room" and enter a name (e.g., Living Room).
2. New room appears in the right list.
3. To delete: select room → click "Delete Room".

***Adding Devices to Rooms:***
1. Select a device from the left list.
2. Select a room from the right list.
3. Click "Add to Room".
4. Confirmation appears in the log.


4. DEVICE CONTROL
===================================================================================

***Power Control:***
• Select any device or room → click "Turn On" or "Turn Off"
• Entire rooms turn on/off together (Composite pattern)

***Thermostat Control:***
• Select a thermostat or a room containing one
• Use the temperature slider (15–30°C)
• All thermostats in a room update together

***Speaker Volume Control:***
• Select a speaker or a room containing one
• Use the volume slider (0–100%)
• Beautiful custom-styled slider with color feedback


5. TEXT LOG AREA
===================================================================================

All actions and real-time notifications appear at the bottom:
• Device creation/deletion
• Room creation/deletion
• Device-room assignments
• Power state changes
• Temperature & volume adjustments
• Observer pattern messages


7. DESIGN PATTERNS IMPLEMENTED
===================================================================================

• Factory       → DeviceFactory.java
• Singleton     → CentralController.java
• Adapter       → OldFanAdapter.java (integrates legacy fan)
• Composite     → RoomComposite.java (rooms = groups of devices)
• Observer      → DeviceSubject + Observer interface (real-time GUI updates)



8. JAVADOC API DOCUMENTATION
===================================================================================

Open: dist/javadoc/index.html in any browser
Fully documented professional API with pattern explanations.


9. COMPATIBILITY NOTE FOR OLDER JDK
===================================================================================

Built with JDK 24+. If you get errors on older JDK:
1. Right-click project → Properties
2. Sources → Set Source/Binary Format to your JDK version
3. Libraries → Select correct Java Platform
4. Clean and Build → Run again


10. CREDITS
===================================================================================

Developed by:
• Sathya-om Ramdass  – Full programming, GUI design, Javadoc, refactoring
• Jonathan Walkes    – Design patterns planning, testing, documentation support

Thank you for reviewing our Smart Home Automation System!
We hope you enjoy using it as much as we enjoyed building it.

===================================================================================
