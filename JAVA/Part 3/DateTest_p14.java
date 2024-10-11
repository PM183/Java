/*Create a class called Date that includes three pieces of information as instance variables—a month (type int), 
a day (type int) and a year (type int). Your class should have a constructor that initializes the three instance 
variables and assumes that the values provided are correct. Provide a set and a get method for each instance 
variable. Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
Write a test application named DateTest that demonstrates class Date’s capabilities. */

public class DateTest_p14 {
    public static void main(String[] args) {
        Date date = new Date(12, 25, 2020);
        System.out.println(date.displayDate());
        
        // Test set and get methods
        date.setMonth(1);
        date.setDay(1);
        date.setYear(2021);
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());
    }
}

class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String displayDate() {
        return month + "/" + day + "/" + year;
    }
}

            

                


