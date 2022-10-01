/**
 * SmartHomeDevice is a blueprint for which smart devices will be built.
 * It has attributes that are common to devices that will inherit it
 * @var smartHomeDeviceName is the name of the smart device
 * @var smartHomeDeviceCategory tells the category of the smart home device, which could be;
 * Entertainment, Utility or Security device. Just limiting my code to these devices.
 */
abstract class SmartHomeDevice{
    private String smartHomeDeviceName, smartHomeDeviceCategory;
    private String smartDeviceStatus = "ONLINE", deviceType;


    //@param constructor for class
    public SmartHomeDevice(String smartHomeDeviceName, String smartHomeDeviceCategory ){
        this.smartHomeDeviceName = smartHomeDeviceName;
        this.smartHomeDeviceCategory = smartHomeDeviceCategory;
    }

    public SmartHomeDevice(String smartHomeDeviceName) {
        this.smartHomeDeviceName = smartHomeDeviceName;
    }

    //setter and getter methods for attributes of a smart home device used in the class
    public String getSmartHomeDeviceName() {
        return smartHomeDeviceName;
    }

    public void setSmartHomeDeviceName(String smartHomeDeviceName) {
        this.smartHomeDeviceName = smartHomeDeviceName;
    }

    public String getSmartHomeDeviceCategory() {
        return smartHomeDeviceCategory;
    }

    public void setSmartHomeDeviceCategory(String smartHomeDeviceCategory) {
        this.smartHomeDeviceCategory = smartHomeDeviceCategory;
    }

    public String getSmartDeviceStatus() {
        return smartDeviceStatus;
    }

    private void setSmartDeviceStatus(String smartDeviceStatus) {
        this.smartDeviceStatus = smartDeviceStatus;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    //methods used to turn on and off a smart home device
    public void turnOnSmartDevice(){
        //System.out.println("ON");
        setSmartDeviceStatus("ONLINE");
    }

    public void turnOffSmartDevice(){
       // System.out.println("OFF");
        setSmartDeviceStatus("OFFLINE");
    }
    abstract  public void displayDeviceInfo ();
}