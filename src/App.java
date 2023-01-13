import utils.HandleHolidays;
import utils.Input;
import utils.Logger;

public class App {

    private static final HandleHolidays handleHolidays = new HandleHolidays();
    private static String command = null;

    public static void main(String[] args) throws Exception {

        Logger.log("Starting program ...");
        Logger.log("");


        while (command != "finish") {
            showCommands();
            Logger.log("");

            command = Input.scan();
            Logger.log("");

            handleCommand(command);
            Logger.log("");
        }

        Logger.log("Program finished ...");
    }

    public static void handleCommand (String command) {
        switch (command) {
            case ("all"): handleHolidays.getAllHolidays(); break;
            case ("date"): handleHolidays.findHolidayByDate(); break;
            case ("name"): handleHolidays.findHolidayByName(); break;
        }
    }

    public static void showCommands () {
        Logger.log("Choose and insert a command ...");
        Logger.log("'date' to search a holiday by date;");
        Logger.log("'name' to search a holiday by name;");
        Logger.log("'finish' to close application;");
        Logger.log("'all' to search all holidays;");
    }
}
