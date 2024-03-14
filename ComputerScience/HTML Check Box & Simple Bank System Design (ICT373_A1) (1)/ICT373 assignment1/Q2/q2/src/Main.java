
/**
 * @title   Main
 * @desc    Main class that runs the menu for user navigation
 * @filename Main.java
 * @version 0.1
 * @date        14/10/2022
 * @author      Lee Jihu
 */

public class Main {
    /**
     * Main Method displays the Student details, runs the client and runs the menu
     * @param args  Arguments
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.displayStudentDetails();
        client.promptMainOptions();
    }
}
