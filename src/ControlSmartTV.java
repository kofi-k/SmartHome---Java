import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *@ControlSmartTV is the class from where smart tv device will be controlled
 *@samsungTv is an instance (object) of the SmartLightDevice.
 * the basic logic here is we would want to make sure a smartDevice is online before we can
 * use them (invoke their behaviors (methods)).
 */
public class ControlSmartTV {
    private final Scanner userInput = new Scanner(System.in);
    private final SmartTvDevice samsungTv = new SmartTvDevice("Samsung Neo Q-LED 8K");
    public void showTVMenu(){
        List<String> tvMenu = new ArrayList<>();
        tvMenu.add("Change TV channel");
        tvMenu.add("Show channel list");
        tvMenu.add("Change TV display port");
        tvMenu.add("Increase TV volume");
        tvMenu.add("Decrease TV volume");
        tvMenu.add("Display TV Info");
        tvMenu.add("Turn TV off");

        int number = 1;
        for (String option: tvMenu) {
            System.out.println(number+"\t"+option);
            number ++;
        }
        System.out.println();
        System.out.print("Choice\t");
    }
    protected void actionOnMenuSelected(int choice){
        choice -=1;
        switch (choice) {
            case 0 -> changeTvChannel();
            case 1 -> channelList();
            case 2 -> changeSmartTvDisplayPort();
            case 3 -> increaseSmartTvSpeakerVolume();
            case 4 -> decreaseSmartTvSpeakerVolume();
            case 5 -> displaySmartTvInfo();
            case 6 -> turnOffTv();
            default -> turnOnTv();
        }
    }


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

    protected String tvStatus() {
        return samsungTv.getSmartDeviceStatus();
    }

}
