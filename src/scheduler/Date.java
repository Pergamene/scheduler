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
        switch (monthInt) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dayX > 0 && dayX < 32)
                    this.day = dayX;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(dayX > 0 && dayX < 31)
                    this.day = dayX;
                break;
            case 2:
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
