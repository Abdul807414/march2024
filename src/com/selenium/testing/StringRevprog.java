package com.selenium.testing;

public class StringRevprog {
    public static void main(String[] args) {
        String str = "ADP456Selenium";
        //4+5+6+ =15
        
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int val = Character.getNumericValue(ch);
                sum = sum + val;
            }
        }

        System.out.println("sum is: " + sum);
    }
}
