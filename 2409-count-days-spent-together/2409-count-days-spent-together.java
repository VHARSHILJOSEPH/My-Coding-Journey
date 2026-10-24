class Solution {
    public static int convertToDayOfYear(String dateStr) {
        int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int month = Integer.parseInt(dateStr.substring(0, 2));
        int day = Integer.parseInt(dateStr.substring(3, 5));

        int dayCount = day;
        for (int i = 1; i < month; i++) {
            dayCount += months[i];
        }
        return dayCount;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        

        int aliceStart = convertToDayOfYear(arriveAlice);
        int aliceEnd = convertToDayOfYear(leaveAlice);
        int bobStart = convertToDayOfYear(arriveBob);
        int bobEnd = convertToDayOfYear(leaveBob);

        int max1 = Math.max(aliceStart, bobStart);
        int min1 = Math.min(aliceEnd, bobEnd);

        if (max1 > min1)
            return 0;
        return min1 - max1+1;
    }
}