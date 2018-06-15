package scheduler;


public class Date {
    int day;
    Month month;
    int monthInt;
    int year;


    public int getDay() {
        return day;
    }

    public void setDay(int dayX){
        int feb = 28;
        switch (month) {
            case January:
            case March:
            case May:
            case July:
            case August:
            case October:
            case December:
                if (dayX > 0 && dayX < 32)
                    this.day = dayX;
                break;
            case April:
            case June:
            case Septemper:
            case November:
                if(dayX > 0 && dayX < 31)
                    this.day = dayX;
                break;
            case February:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            feb = 29;
                        }
                    }
                    else {
                        feb = 29;
                    }
                }
                if(dayX > 0 && dayX < feb)
                    this.day = dayX;
                feb = 28;
            default:
                System.out.print("Invalid Day");
                break;
        }
    }

    public int getMonthInt() {
        return monthInt;
    }
    public void setMonthInt(int monthIntX) {
        if (monthIntX > 0 && monthIntX <13)
            this.monthInt = monthIntX;
        else {
            System.out.print("Invalid MonthInt");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2017)
            this.year = year;
        else {
            System.out.print("Invalid Year");
        }
    }



}
