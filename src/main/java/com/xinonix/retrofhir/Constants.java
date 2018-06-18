package com.xinonix.retrofhir;

import java.text.SimpleDateFormat;

public class Constants {

    // Date Formatting Constants
    public static SimpleDateFormat FORMATTER_YEAR = new SimpleDateFormat("yyyy");
    public static SimpleDateFormat FORMATTER_YEAR_MONTH = new SimpleDateFormat("yyyy-MM");
    public static SimpleDateFormat FORMATTER_YEAR_MONTH_DAY = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat FORMATTER_TIME = new SimpleDateFormat("HH:mm:ss.SSS");
    public static SimpleDateFormat FORMATTER_DATE_TIME = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    public static SimpleDateFormat FORMATTER_DATE_TIME_MILLISECONDS = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    public static SimpleDateFormat FORMATTER_DATE_TIME_MILLISECONDS_TIMEZONE = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

}
