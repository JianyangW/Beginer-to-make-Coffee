package CN.Jianyang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        /*CanlendarDemo1();
        HowLongFromBirthday();
        */
        Setmonth();
    }

    public static void CanlendarDemo1() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today is "+year+"year and "+month+"month and "+day+"day");
    }

    public static void HowLongFromBirthday() throws Exception {
        System.out.println("Please type your birthday in yyyy-mm-dd format.");
        String birthday = new Scanner(System.in).next();
        SimpleDateFormat ymd = new SimpleDateFormat( "yyyy-MM-dd");
        Date BirthdayDate = ymd.parse(birthday);
        Date TodayDate = new Date();

        long BirthdayDateLong = BirthdayDate.getTime();
        long TodayDateLong = TodayDate.getTime();
        long time = TodayDateLong - BirthdayDateLong;
        long days = time/(60*60*24*1000);

        if (days <= 0) {
            System.out.println("Sorry, You are not borne yet! Please Waite! Anyone else want try?");
            /* String type = new Scanner(System.in).next();
            if (type == "Yes") {
                HowLongFromBirthday();
            }
            else {
                System.out.println("Thanks doing this test!");
            }
            */
            HowLongFromBirthday();
        }
        else {
        System.out.println("This this the time how long you live in this earth in days:");
        System.out.println(days);
            HowLongFromBirthday();
        }
    }

    public static void Setmonth() {
        Calendar Ca = Calendar.getInstance();
        System.out.println("闰年指的是在这一年二月有29天，非瑞年的二月是有20天。");
        System.out.println("如果你想知道某一年是否是瑞年，请使用这个系统。");
        System.out.println("``````````````````````````````````````");
        System.out.println("``````````````````````````````````````");
        System.out.println("``````````请输入你想查询的年份：``````````");
        int typedNumber = new Scanner(System.in).nextInt();
        Ca.set(typedNumber, 2, 1);
        Ca.add(Calendar.DAY_OF_MONTH, -1);
        int DayInFeburary = Ca.get(Calendar.DAY_OF_MONTH);
        int Difference = DayInFeburary - 29;
        if (Difference != 0) {
            System.out.println("你输入的年份不是瑞年。");
        } else {
            System.out.println("你输入的年份是瑞年。");
        }
    }

}
