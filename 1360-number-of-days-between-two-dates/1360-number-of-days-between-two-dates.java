class Solution {

    public static int convertToDayOfYear(String dateStr) {
    int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int[] monthsLeap = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    int year = Integer.parseInt(dateStr.substring(0, 4));
    int month = Integer.parseInt(dateStr.substring(5, 7));
    int day = Integer.parseInt(dateStr.substring(8, 10));
    
    int dayCount = day;
    boolean isCurrentYearLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    
    
    for (int i = 1; i < month; i++) {
        dayCount += isCurrentYearLeap ? monthsLeap[i] : months[i];
    }
    
    
    for (int i = 1900; i < year; i++) {
        if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
            dayCount += 366;
        } else {
            dayCount += 365;
        }
    }
    
    return dayCount;
}


    public int daysBetweenDates(String date1, String date2) {
        int day1 = convertToDayOfYear(date1);
        int day2 = convertToDayOfYear(date2);

        return day2 > day1 ? day2 - day1 : day1 - day2;

    }
}