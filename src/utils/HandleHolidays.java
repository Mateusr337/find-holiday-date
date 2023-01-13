package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import model.Holiday;

public class HandleHolidays {

    private static final List<Holiday> holidays = new ArrayList<>();
    
    public HandleHolidays () {
        Logger.log("Creating holidays ...");
        createHolidays();
    }

    public void getAllHolidays () {
        Logger.log("Fetching all holidays ...");
        holidays.forEach(holiday -> Logger.log("name: " + holiday.getName() + ", date: " + holiday.getDate()));
    }

    public void  findHolidayByName (String name) {
        Logger.log("fetching holiday by name: " + name + " ...");
        Optional<Holiday> optionalHoliday = holidays
            .stream()
            .filter(holiday -> Objects.equals(holiday.getName(), name))
            .findFirst();

            validateOptionalHoliday(optionalHoliday);
    }

    public void findHolidayByDate (String date) {
        Logger.log("fetching holiday by date: " + date + " ...");

        Optional<Holiday> optionalHoliday = holidays
            .stream()
            .filter(holiday -> Objects.equals(holiday.getDate(), date))
            .findFirst();

        validateOptionalHoliday(optionalHoliday);
    }

    private void validateOptionalHoliday (Optional<Holiday> optionalHoliday) {
        if (optionalHoliday.isPresent()) {
            Logger.log("Holiday found!");
            Logger.log("The Holiday name is: " + optionalHoliday.get().getName());
            Logger.log("The Holiday date is: " + optionalHoliday.get().getDate());
        } else {
            Logger.log("Holiday not found!");
        }
    }

    public void createHolidays () {
        holidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
        holidays.add(new Holiday("21/02/2023", "Carnaval"));
        holidays.add(new Holiday("17/04/2023", "Páscoa"));
        holidays.add(new Holiday("21/04/2023", "Tiradentes"));
        holidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
        holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
        holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
        holidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
        holidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
        holidays.add(new Holiday("15/11/2023", "Proclamação da República"));
        holidays.add(new Holiday("15/11/2023", "Proclamação da República"));

        Logger.log("Created holidays");
    }
}
