package sena.homework.hw09.hw0902;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        Date now = new Date();

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
        Date myBirthday = formatter1.parse("08-04-1972");
        long age = now.getTime() - myBirthday.getTime();

        Date ageInDate = new Date(age);
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");
        int year = Integer.parseInt(formatterYear.format(ageInDate)) - 1970;
        SimpleDateFormat formatterMonth = new SimpleDateFormat("MM");
        int month = Integer.parseInt(formatterMonth.format(ageInDate));
        SimpleDateFormat formatterDays = new SimpleDateFormat("dd");
        int days = Integer.parseInt(formatterDays.format(ageInDate));
        SimpleDateFormat formatterHour = new SimpleDateFormat("HH");
        int hours = Integer.parseInt(formatterHour.format(ageInDate));
        SimpleDateFormat formatterMinuts = new SimpleDateFormat("mm");
        int minuts = Integer.parseInt(formatterMinuts.format(ageInDate));
        SimpleDateFormat formatterSec = new SimpleDateFormat("ss");
        int sec = Integer.parseInt(formatterSec.format(ageInDate));

        System.out.println("Вам виповнилося " +
                year + " років, " +
                month + " місяців, " +
                days + " днів, " +
                hours + " годин, " +
                minuts + " хвилин та " +
                sec + " секунд."
                );
    }
}
