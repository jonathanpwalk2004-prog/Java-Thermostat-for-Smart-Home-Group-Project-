package devices;

// This is the legacy device without SmartDevice interface
public class OldFan {

    public void startSpin() {
        System.out.println("Old Fan is spinning!");
    }

    public void stopSpin() {
        System.out.println("Old Fan stopped.");
    }

    public String getLegacyName() {
        return "Old Legacy Fan";
    }
    
}

