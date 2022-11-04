import java.util.Scanner;

/**
 * The smartHomeDevices would have to be used somewhere and there's no place like home, especially
 * when it's a smart one
 *
 * @SmartHome is a class where the smartHomeDevices will be used
 */
class SmartHome {

    protected void useDevice() {
        Scanner userInput = new Scanner(System.in);
        ControlSmartTV controlSmartTV = new ControlSmartTV();
        ControlSmartLight controlSmartLight = new ControlSmartLight();
        System.out.println("WELCOME HOME TO THE SMART HOME\nWhat do you want to use?");
        System.out.println("\tDevice\t\t\t\tStatus");
        System.out.println("1.\tSmart TV\t\t\t" + controlSmartTV.tvStatus());
        System.out.println("2.\tSmart Light\t\t\t" + controlSmartLight.kasaLightStatus());
        System.out.println("3.\tSmart Door\t\t\tUNKNOWN");
        System.out.println();
        System.out.print("Choice\t");

        try {
            int choice = userInput.nextInt();
            if (choice == 1) {
                controlSmartTV.turnOnTv();
                controlSmartTV.showTVMenu();
                choice = userInput.nextInt();
                controlSmartTV.actionOnMenuSelected(choice);
            } else if (choice == 2) {
                controlSmartLight.turnOnKasaSmartLight();
                controlSmartLight.showSmartLightControls();
                choice = userInput.nextInt();
                controlSmartLight.actionOnControlSelected(choice);

            } else {
                System.out.println("//TODO Smart Door");
            }
        } catch (Exception e) {

            System.out.print("Wrong input. Numbers only ");
        }
    }

}



