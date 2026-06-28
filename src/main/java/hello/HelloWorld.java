package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}

public class UseHelp {

    // Method to display general help
    public static void showGeneralHelp() {
        System.out.println("=== Application Help ===");
        System.out.println("Available commands:");
        System.out.println("  start   - Start the application");
        System.out.println("  stop    - Stop the application");
        System.out.println("  status  - Show current status");
        System.out.println("  help    - Show this help message");
    }

    // Method to display help for a specific command
    public static void showCommandHelp(String command) {
        switch (command.toLowerCase()) {
            case "start":
                System.out.println("Usage: start\nStarts the application.");
                break;
            case "stop":
                System.out.println("Usage: stop\nStops the application.");
                break;
            case "status":
                System.out.println("Usage: status\nDisplays the current status.");
                break;
            case "help":
                System.out.println("Usage: help\nShows available commands.");
                break;
            default:
                System.out.println("Unknown command: " + command);
                showGeneralHelp();
        }
    }
}

