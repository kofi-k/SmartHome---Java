public class MainClass {
    /**
     *what am I supposed to say here...
     * test out
     * @param args
     */
    public static void main(String... args) {
        SmartHome RoyHome = new SmartHome();
        System.out.println();
        RoyHome.turnOnTv();
        RoyHome.increaseSmartTvSpeakerVolume();
        //RoyHome.decreaseSmartTvSpeakerVolume();
        RoyHome.changeTvChannel();
       // RoyHome.changeSmartTvDisplayPort();
        RoyHome.displaySmartTvInfo();
        // RoyHome.turnOffTv();
        RoyHome.channelList();
        System.out.println();
        RoyHome.turnOnKasaSmartLight();
        //RoyHome.turnOffKasaSmartLight();
        RoyHome.increaseKasaSmartLightBrightness();
        //RoyHome.decreaseKasaSmartLightBrightness();
        RoyHome.displayKasaSmartLightInfo();
    }
}
