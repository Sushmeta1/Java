public class week_days {
    public static void main(String[] args) {

        int dayNum = 5;

        String dayName;

        switch (dayNum) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number. Please enter a number between 1 and 7.";
        }

        System.out.println(dayName);
    }
}