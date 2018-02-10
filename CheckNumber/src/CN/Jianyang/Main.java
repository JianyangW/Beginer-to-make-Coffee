package CN.Jianyang;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckPhoneN("15939890291");
        SplitNumber("112tt3321t77798t33");
        Date t = new Date();
        System.out.println(t);
    }

    public static void CheckPhoneN(String PhoneNumber) {
        boolean b = PhoneNumber.matches("1[35689][\\d]{9}");
        System.out.println(b);
    }

    public static void SplitNumber(String Numbers) {
        String NumbersOnly = Numbers.replaceAll("t+"," ");
        System.out.println(NumbersOnly);

        String[] strArr = Numbers.split("t+");
        for(int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
