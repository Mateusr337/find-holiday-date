package model;

public class Holiday {
    private String name;
    private String date;

    public Holiday (String date, String name) {
        this.name = name;
        this.date = date;
    }

    public String getName () {
        return name;
    }

    public String getDate () {
        return date;
    }
}
