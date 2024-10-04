package DateAndTimeAPI;

import java.time.*;
import java.util.Scanner;

public class DateAndTimeDemo {
    public static void main(String[] args) {

        //To print the current date in your system.
        LocalDate date = LocalDate.now();
        System.out.println("Current date in your system : "+date);
        //Output : Current date in your system : 2022-12-29

        int day = date.getDayOfMonth();
        System.out.println("Day of month : "+day);
        //Output : Day of month : 29

        int month = date.getMonthValue();
        System.out.println("Month : " + month);
        // Output : Month : 12

        int year = date.getYear();
        System.out.println("Year is : "+year);
        //Output : Year is : 2022

        //you can write from above in which formate you want to the local date.
        System.out.println(day+"-"+month+"-"+year);
        //Output : 29-12-2022

        System.out.printf("%d-%d-%d",day,month,year);
        //Output : 29-12-2022

//***********************************************************************************************************

        //to print the current time of your system.
        LocalTime time = LocalTime.now();
        System.out.println("Current time of your system : "+time);
        //Output : Current time of your system : 10:00:10.800952800

        int hour = time.getHour();
        System.out.println("Hour is : "+hour);
        //Output : Hour is : 10

        int minute = time.getMinute();
        System.out.println("Minute is : "+minute);
        //Output : Minute is : 46

        int second = time.getSecond();
        System.out.println("Second is : "+second);
        //Output : Second is : 58

        int nanoSecond = time.getNano();
        System.out.println("Nano Second is : "+nanoSecond);
        //Output : Nano Second is : 959574400

        System.out.printf("%d:%d:%d:%d",hour,minute,second,nanoSecond);
        //Output : 10:46:58:959574400

        System.out.println();

//***********************************************************************************************************

        //LocalDateTime :
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //Output : 2022-12-29T10:51:19.629230800
        int dd = ldt.getDayOfMonth();
        int mm = ldt.getMonthValue();
        int yyyy = ldt.getYear();
        System.out.printf("%d-%d-%d",dd,mm,yyyy);
        //Output : 29-12-2022
        System.out.println();

        int hh = ldt.getHour();
        int min = ldt.getMinute();
        int sec = ldt.getSecond();
        int nSec = ldt.getNano();
        System.out.printf("%d:%d:%d:%d",hh,min,sec,nSec);
        System.out.println();
        //Output : 10:56:12:377629900


        //If you want to print own date and time in own format
        LocalDateTime lt = LocalDateTime.of(1995, Month.MAY, 28, 12, 45);
        System.out.println(lt);
        //Output : 1995-05-28T12:45

        //after 6 months what is day
        System.out.println("After six month : "+ lt.plusMonths(6));
        //Output : After six month : 1995-11-28T12:45

        //before 6 month date is
        System.out.println("Before six month : "+lt.minusMonths(6));
        //Output : Before six month : 1994-11-28T12:45

//***********************************************************************************************************

        //Period class is also present in Date and Time API
        LocalDate birthday = LocalDate.of(1998, 06, 11);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday, today);
        System.out.printf("Your age is %d Years %d Months %d days", p.getYears(), p.getMonths(), p.getDays());
        System.out.println();
        //Output : Your age is 24 Years 6 Months 18 days


        LocalDate death_day = LocalDate.of(1998+60, 06, 11);
        Period p1 = Period.between(today, death_day);
        int d = p.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
        System.out.printf("You will be on earth only %d Days. Hurry up to do more important things", d);
        System.out.println();

//***********************************************************************************************************


        //Year class is also present in Date and Time API
        //year is leap or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int y = sc.nextInt();

        Year leapOrNot = Year.of(y);
        if(leapOrNot.isLeap()) {
            System.out.printf("%d This is leap year", y);
        }
        else {
            System.out.printf("%d This is not leap year", y);
        }
        System.out.println();

//        Output :
//        Enter year : 2000
//        2000 This is leap year

//***********************************************************************************************************

        //ZoneId : It is used to Zone
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("Current zone is : "+zone);
        //Output : Current zone is : Asia/Calcutta

        //for particular zone
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdt = ZonedDateTime.now(la);
        System.out.println(zdt);
        //Output : 2022-12-28T22:56:27.678787800-08:00[America/Los_Angeles]
    }
}
