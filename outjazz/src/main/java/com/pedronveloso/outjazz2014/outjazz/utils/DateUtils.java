package com.pedronveloso.outjazz2014.outjazz.utils;


import java.util.Calendar;
import java.util.GregorianCalendar;

public final class DateUtils {

    /**
     * @param cal calendar to format
     * @return Date in format similar to this "1 de Janeiro"
     */
    public static String getShortSmartDate(GregorianCalendar cal) {
        return cal.get(Calendar.DAY_OF_MONTH) + " de " + getMonthName(cal);
    }

    public static String getMonthName(GregorianCalendar cal) {
        switch (cal.get(Calendar.MONTH)) {
            case Calendar.JANUARY:
                return "Janeiro";
            case Calendar.FEBRUARY:
                return "Fevereiro";
            case Calendar.MARCH:
                return "Março";
            case Calendar.APRIL:
                return "Abril";
            case Calendar.MAY:
                return "Maio";
            case Calendar.JUNE:
                return "Junho";
            case Calendar.JULY:
                return "Julho";
            case Calendar.AUGUST:
                return "Agosto";
            case Calendar.SEPTEMBER:
                return "Setembro";
            case Calendar.OCTOBER:
                return "Outubro";
            case Calendar.NOVEMBER:
                return "Novembro";
            case Calendar.DECEMBER:
                return "Dezembro";

            default:
                return "";
        }

    }


}
