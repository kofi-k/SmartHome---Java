import java.util.ArrayList;

/**
 * @SmartTvDevice is a subclass(you could also say sub-device) which inherits the superclass @SmartHomeDevice.
 * Category of device is Entertainment
 * Type of device is a Smart TV
 * Name of device is Samsung Android TV, everybody loves Samsung, but I prefer Apple :D
 */
public class SmartTvDevice extends SmartHomeDevice {
    /**
     * @speakerVolume to be used to regulate the volume of the TV set
     * @channel initialized to be displayed when TV is turned on, do you prefer booting to a blank screen? ...I thought so
     * @display sets the port for which TV will operate
     */
    private int speakerVolume = 5;
    private String channel = "SuperSport Select";
    protected String display = "HDMI 1";
    private final String deviceName;

    @Override
    public String getSmartDeviceStatus() {
        return super.getSmartDeviceStatus();
    }

    //declaration of an arrayList collection to contain list of channels on a smart tv
    ArrayList<String> channelList = new ArrayList<>();

    /**
     * default constructor for smartTVDevice
     * @param smartHomeDeviceName is the name of any smart tv instance to be created
     */
    public SmartTvDevice(String smartHomeDeviceName) {
        super(smartHomeDeviceName);
        this.deviceName = smartHomeDeviceName;
    }


    //we might want to throw some channels into channelList collection
    protected void dstvChannels() {
        channelList.add("BBC World News");
        channelList.add("SuperSport Select");
        channelList.add("MTV Base");
        channelList.add("STN TV");
        channelList.add("Kameme TV");
        channelList.add("Nickelodeon");
        channelList.add("Inooro TV");
        channelList.add("Safari TV");
        channelList.add("Citizen TV");
        channelList.add("Sony Max");
        channelList.add("K24 TV");
        channelList.add("NBS TV");
    }

    /**
     * polymorphism in action
     * @turnOnSmartDevice and
     * @turnOffSmartDevice methods overridden from the superclass @SmartHomeDevice
     */
    @Override
    public void turnOnSmartDevice() {
        dstvChannels();
        super.turnOnSmartDevice();
        System.out.println(deviceName + " turned on. Channel on " + channel +
                " with speaker volume at " + speakerVolume);
    }

    @Override
    public void turnOffSmartDevice() {
        super.turnOffSmartDevice();
        System.out.println("Smart Tv powered off.");
    }

    /**
     * @increaseSmartTvVolume and
     * @decreaseSmartTvVolume methods declared to be used to regulate speaker volume when invoked
     */
    protected void increaseSmartTvVolume() {
        speakerVolume++;
        if (speakerVolume > 10) { //we don't want to be the noisy neighbour, lets have some manners and to keep TV under control
            speakerVolume = 10;
        }
        System.out.println("Smart Tv speaker volume increased to " + speakerVolume + ".");
    }

    protected void decreaseSmartTvVolume() {
        speakerVolume--;
        if (speakerVolume < 0) {
            speakerVolume = 0;
        }
        System.out.println("Smart Tv speaker volume decreased to " + speakerVolume + ".");
    }

    /**
     * @setChannelTo method, well, variety we know is the... I knew you'd finish that
     * we'd use this bad boy(method) to change channels
     * @param channelNumber is the number of the channel to be switched to
     */
    protected void setChannelTo(int channelNumber) {
        System.out.println("Channel changed to " + channelList.get(channelNumber - 1) + ".");
    }

    //just a humble method to iterate through our collection and return the channels we got in there
    protected void showChannelList() {
        //ignore this shitty UI
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("\t\tN0.\t\tChannel Name");
        System.out.println("**********************************************");

        /**
         * meet the main guy, quite simple yet super efficient
         * notice we're able to loop through our channelList collection without using iterations nor conditions
         * just like that
         * TheBeastUnderTheHood: Remember our channelList is a collection of strings
         * @param channel represents each item in that channelList collection, fast-forward
         *                we print the index of each item in the collection + 1 (indexing begins from 0,
         *                but no we wouldn't want the ordinary user to think the smart TV is on crack so +1
         *                would keep us with our usual numbering system) and the item at that index.
         *                ...You see wah Im sayin when Im sayin wah Im sayin?
         */
        for (String channel : channelList) {
            System.out.println("\t\t" + (channelList.indexOf(channel) + 1) + "\t\t" + channel);
        }

        System.out.println("**********************************************");
    }

    /**
     * switchy switch to switch between ports to set the display the of our TV
     * gear up for the PlayStation console!
     */
    protected void displayPort(int port) {
        switch (port) {
            case 0:
                display = "VGA";
                break;
            case 2:
                display = "HDMI 2";
                break;
            case 3:
                display = "USB";
                break;
            default:
                display = "HDMI 1";
                break;
        }
        System.out.println("Smart TV on " + display + " display ");

    }

    /**
     * meet the lazy guy in the code, all he does is to
     * display the smart TV info!
     * ...and he still gets paid
     */
    @Override
    public void displayDeviceInfo() {
        setDeviceType("Smart TV");
        setSmartHomeDeviceCategory("Entertainment");
        System.out.println();
        System.out.println("Device Name: " + deviceName);
        System.out.println("Device Category: " + getSmartHomeDeviceCategory());
        System.out.println("Device Type: " + getDeviceType());
    }

}
