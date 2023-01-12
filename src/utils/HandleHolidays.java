package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import model.Holiday;

public class HandleHolidays {

    private List<Holiday> holidays = new ArrayList<>();
    
    public HandleHolidays (List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public void getHolidays () {
        Logger.log("Fetching all holidays ...");
        Logger.log(holidays);
    }

    public void  findHoliday (String name) {
        Optional<Holiday> foundHoliday = holidays
            .stream()
            .filter(holiday -> Objects.equals(holiday.getName(), name))
            .findFirst();
        
        if (foundHoliday.isPresent()) {
            Logger.log("Holiday found!");
            Logger.log("The Holiday is: " + foundHoliday.get().getName());
            Logger.log("The Holiday date is: " + foundHoliday.get().getDate());

        } else {
            Logger.log("Holiday not found!");
        }
    }
}
