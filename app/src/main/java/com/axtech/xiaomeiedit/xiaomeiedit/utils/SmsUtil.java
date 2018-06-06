package com.axtech.xiaomeiedit.xiaomeiedit.utils;

import java.util.Date;

/**
 * Created by baijianwei on 2017/7/10.
 */

public class SmsUtil {

    public String randomWord(int length) {
        String arr[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String str = "";
        for (int i = 0; i < length; i++) {
            int pos = (int) Math.round(Math.random() * (arr.length - 1));
            str += arr[pos];
        }
        return str;
    }


    public String getToken(String mobile) {
        String num1 = mobile.substring(mobile.length() - 1, mobile.length());
        String num2 = mobile.substring(mobile.length() - 2, mobile.length() - 1);
        String num3 = mobile.substring(mobile.length() - 3, mobile.length() - 2);
        String subMobile = mobile.substring(3, 6);// 4-6位

        String token = randomWord(20 + Integer.valueOf(num3));
        System.out.println(num1 + " " + num2 + " " + num3 + " " + subMobile + " " + token);

        long timestamp = new Date().getTime();
        token = token.substring(0, Integer.valueOf(num2)) + timestamp + token.substring(Integer.valueOf(num2));
        token = token.substring(0, Integer.valueOf(num1)) + subMobile + token.substring(Integer.valueOf(num1));

        System.out.println("token:" + token);
        return token;
    }

}
