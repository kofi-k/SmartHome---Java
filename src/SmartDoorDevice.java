public class SmartDoorDevice extends SmartHomeDevice {

    private final String deviceName;
    private Boolean lockDoor = Boolean.FALSE;

    public SmartDoorDevice(String smartHomeDeviceName) {
        super(smartHomeDeviceName);
        this.deviceName = smartHomeDeviceName;
    }

    @Override
    public void turnOffSmartDevice() {
        super.turnOffSmartDevice();
    }


    @Override
    public String getSmartDeviceStatus() {
        return super.getSmartDeviceStatus();
    }

    @Override
    public void displayDeviceInfo() {

    }
    //TODO open and close sesame in here
}
