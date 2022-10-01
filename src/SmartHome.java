import java.util.Scanner;

/**
 * The smartHomeDevices would have to be used somewhere and there's no place like home, especially
 * when its smart
 * @SmartHome is a class on its own that will be a home for the smartHomeDevices
 *
 */
class SmartHome {

    /**
     * @SmartTvDevice is an instance (object) of the SmartTvDevice.
     * @SmartLightDevice is an instance (object) of the SmartLightDevice.
     * @userInput is a Scanner object to read user input
     *
     * the basic logic here is we would want to make sure a smartDevice is online before we can
     * use them (invoke their behaviors (methods)).
     */

    private final Scanner userInput = new Scanner(System.in);
    private final SmartTvDevice samsungTv = new SmartTvDevice("Samsung Neo Q-LED 8K");

    private final SmartLightDevice kasaSmartLight =
            new SmartLightDevice("Kasa Smart Light", "Utility");

    protected void turnOnTv() {
        samsungTv.turnOnSmartDevice();
    }
    protected void turnOffTv() {
        if (samsungTv.getSmartDeviceStatus().equals("ONLINE") && samsungTv.display.equals("HDMI 1")) {
            samsungTv.turnOffSmartDevice();
        }
    }

    protected void increaseSmartTvSpeakerVolume() {
        if (samsungTv.getSmartDeviceStatus().equals("ONLINE") && samsungTv.display.equals("HDMI 1")) {
            samsungTv.increaseSmartTvVolume();
        }
    }

    protected void decreaseSmartTvSpeakerVolume() {
        if (samsungTv.getSmartDeviceStatus().equals("ONLINE") && samsungTv.display.equals("HDMI 1")) {
            samsungTv.decreaseSmartTvVolume();
        }
    }

    protected void changeTvChannel() {
        int channelNumber;
        if (samsungTv.getSmartDeviceStatus().equals("ONLINE") && samsungTv.display.equals("HDMI 1") ) {
            System.out.print("Enter channel number to change channel: ");
            /**
             * handle exceptions for inputs other than a positive integer
             */
            try {
                channelNumber = userInput.nextInt(); //read user input
                if (channelNumber != 0 && channelNumber <= samsungTv.channelList.size())
                    samsungTv.setChannelTo(channelNumber);
                else System.out.println("Channel not available.");

            } catch (Exception e) {
                System.out.print("Wrong input. Numbers only ");
            }
        }
    }

    protected void changeSmartTvDisplayPort() {
        int port;
        if (samsungTv.getSmartDeviceStatus().equals("ONLINE")) {
            System.out.print("Enter port number to change TV display: ");
            try {
                port = userInput.nextInt();
                if (port >=0 && port <=3 )
                    samsungTv.displayPort(port);
                else System.out.println("Port does not exist.");

            } catch (Exception e) {
                System.out.print("Wrong input. Numbers only ");
            }
        }
    }

    protected void channelList() {
        if (samsungTv.getSmartDeviceStatus().equals("ONLINE") && samsungTv.display.equals("HDMI 1")) {
            samsungTv.showChannelList();
        }
    }

    protected void displaySmartTvInfo() {
        if (samsungTv.getSmartDeviceStatus().equals("ONLINE") && samsungTv.display.equals("HDMI 1")) {
            samsungTv.displayDeviceInfo();
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
    }}


