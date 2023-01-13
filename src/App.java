import utils.HandleHolidays;
import utils.Logger;

public class App {
    public static void main(String[] args) throws Exception {

        Logger.log("Starting program ...");
        Logger.log("");

        final HandleHolidays handleHolidays = new HandleHolidays();
        Logger.log("");

        handleHolidays.findHolidayByName("Carnaval");
        Logger.log("");

        handleHolidays.findHolidayByDate("15/11/2023");
        Logger.log("");

        handleHolidays.findHolidayByDate("15/11/2024");
        Logger.log("");

        handleHolidays.getAllHolidays();
        Logger.log("");

        Logger.log("Program finished ...");
    }
}
