package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap = ((year % 4 == 0) && year % 100 != 0) || (year%400 == 0);
        int leapCheck = !isLeap ? 0 : 1;

        switch(leapCheck) {
            case 0 :
                System.out.println("not leap");
                break;
            case 1 :
                System.out.println("leap");
                break;
        }
    }
}
