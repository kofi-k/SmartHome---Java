import java.util.ArrayList;
import java.util.List;

/**
 *@ControlSmartLight is the class from where smart light device will be controlled
 *@kasaSmartLight is an instance (object) of the SmartLightDevice.
 * the basic logic here is we would want to make sure a smartDevice is online before we can
 * use them (invoke their behaviors (methods)).
 */
public class ControlSmartLight {
    private final SmartLightDevice kasaSmartLight =
            new SmartLightDevice("Kasa Smart Light", "Utility");

    public void showSmartLightControls(){
        List<String> lightControl = new ArrayList<>();
        lightControl.add("Increase brightness");
        lightControl.add("Decrease brightness");
        lightControl.add("Display light Info");
        lightControl.add("Turn light off");

        int number = 1;
        for (String option: lightControl) {
            System.out.println(number+"\t"+option);
            number ++;
        }
        System.out.println();
        System.out.print("Choice\t");
    }
    protected void actionOnControlSelected(int choice){
        choice -=1;
        switch (choice) {
            case 0 -> increaseKasaSmartLightBrightness();
            case 1 -> decreaseKasaSmartLightBrightness();
            case 2 -> displayKasaSmartLightInfo();
            case 3 -> turnOffKasaSmartLight();
            default -> turnOnKasaSmartLight();
        }
    }

    protected void turnOnKasaSmartLight() {
        kasaSmartLight.turnOnSmartDevice();
    }
    protected void turnOffKasaSmartLight() {
        kasaSmartLight.turnOffSmartDevice();
    }

    protected void increaseKasaSmartLightBrightness() {
        if (kasaSmartLight.getSmartDeviceStatus().equals("ONLINE")) {
            kasaSmartLight.increaseSmartLightBrightness();
        }
    }
    protected void decreaseKasaSmartLightBrightness() {
        if (kasaSmartLight.getSmartDeviceStatus().equals("ONLINE")) {
            kasaSmartLight.decreaseSmartLightBrightness();
        }
    }

    protected void displayKasaSmartLightInfo() {
        if (kasaSmartLight.getSmartDeviceStatus().equals("ONLINE")) {
            kasaSmartLight.displayDeviceInfo();
        }
    }
    protected String kasaLightStatus() {
        return  kasaSmartLight.getSmartDeviceStatus();
    }
}
