package hello;

public class Greeter {
    public String sayHello() {
        return "DevOps Project for AchiStar Technologies";
    }
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

