/**
 * whats a smartHome without a light
 * LET THERE BE LIGHT!!!
 * Basically same implementation and logic as the smartTvDevice
 */
public class SmartLightDevice extends SmartHomeDevice {

    private final String deviceName;
    private final String deviceCategory;

    private int smartLightBrightnessLevel = 3;

    public SmartLightDevice(String smartHomeDeviceName, String smartHomeDeviceCategory) {
        super(smartHomeDeviceName, smartHomeDeviceCategory);
        this.deviceName = smartHomeDeviceName;
        this.deviceCategory = smartHomeDeviceCategory;
    }

    @Override
    public void turnOnSmartDevice() {
        super.turnOnSmartDevice();
        System.out.println(deviceName + " turned on. Brightness level at " + smartLightBrightnessLevel);
    }

    @Override
    public void turnOffSmartDevice() {
        super.turnOffSmartDevice();
        System.out.println("Smart light powered off.");
    }

    void increaseSmartLightBrightness() {
        smartLightBrightnessLevel++;
        if (smartLightBrightnessLevel > 10) {
            smartLightBrightnessLevel = 10;
        }
        System.out.println("Light brightness increased to " + smartLightBrightnessLevel + ".");
    }

    void decreaseSmartLightBrightness() {
        smartLightBrightnessLevel--;
        if (smartLightBrightnessLevel < 0) {
            smartLightBrightnessLevel = 0;
            turnOffSmartDevice();
        }
        System.out.println("Light brightness decreased to " + smartLightBrightnessLevel + ".");
    }

    @Override
    public void displayDeviceInfo() {
        setDeviceType("Smart Light");
        System.out.println();
        System.out.println("Device Name: " + deviceName);
        System.out.println("Device Category: " + deviceCategory);
        System.out.println("Device Type: " + getDeviceType());
    }


}
