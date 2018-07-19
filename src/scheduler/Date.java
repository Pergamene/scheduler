package scheduler;

public class Date {
    private int dayOfMonth;
    private Month month;
    private int year;

    public Date(int dayOfMonth, Month month, int year) {
        this.month = month;
        setDay(dayOfMonth);
        this.year = year;
    }

    public int getDay() {
        return dayOfMonth;
    }

    public void setDay(int dayX){
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                if (dayX >= 1 && dayX <= 31) {
                    this.dayOfMonth = dayX;
                }
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                if(dayX >= 1 && dayX <= 30) {
                    this.dayOfMonth = dayX;
                }
                break;
            case FEBRUARY:
                int feb = 28;
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
                if(dayX > 0 && dayX < feb) {
                    this.dayOfMonth = dayX;
                }
            default:
                System.out.print("Invalid Day");
                break;
        }
    }

    public int getMonthInt() {
        return month.getValue();
    }

    public Month getMont() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2017) {
            this.year = year;
        }
        else {
            System.out.print("Invalid Year");
        }
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Date date = (Date) o;
        return dayOfMonth == date.dayOfMonth && year == date.year && month == date.month;
    }
}
