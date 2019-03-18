
class SecondsCalculator {
    public static void earthTime(int totalSeconds) { //converts a time in seconds to "normally understood time"
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int days = 0;
        int years = 0;
        
        years = totalSeconds / 31536000;
        seconds = totalSeconds % 31536000;
        days = seconds / 86400;
        seconds = seconds % 86400;
        hours = seconds / 3600;
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;
        
        System.out.printf("%d seconds is equivalent to: %d years  %d days  %d hours  %d minutes  %d seconds %n",
            totalSeconds, years, days, hours, minutes, seconds);
    }
}