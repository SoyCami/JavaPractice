package Date;

import java.util.GregorianCalendar;

public class Date {
    private int year;
    private int month;
    private int day;

    // Default constructor
    public Date() {
        GregorianCalendar currentDate = new GregorianCalendar();
        this.year = currentDate.get(GregorianCalendar.YEAR);
        this.month = currentDate.get(GregorianCalendar.MONTH) + 1; // -> Adding 1 as months are zero-based
        this.day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // Constructor with parameters
    public Date(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid date. Using current date instead.");
            GregorianCalendar currentDate = new GregorianCalendar();
            this.year = currentDate.get(GregorianCalendar.YEAR);
            this.month = currentDate.get(GregorianCalendar.MONTH) + 1;
            this.day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
        }
    }

    // -> To check if the date is valid
    private boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1)
            return false;

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // -> Adjusting days in February for leap years
        if (isLeapYear(year))
            daysInMonth[1] = 29;

        return day <= daysInMonth[month - 1];
    }

    // -> To check if it's a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to add one day to the current date
    public void addOneDay() {
        GregorianCalendar cal = new GregorianCalendar(this.year, this.month - 1, this.day);
        cal.add(GregorianCalendar.DAY_OF_MONTH, 1);
        this.year = cal.get(GregorianCalendar.YEAR);
        this.month = cal.get(GregorianCalendar.MONTH) + 1;
        this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // Getters and setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // To represent the Date object as a String
    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", this.month, this.day, this.year);
    }
}

