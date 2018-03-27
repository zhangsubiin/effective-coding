package com.subin.code.guidelines.toString;

/**
 * TODO description:
 *
 * @author shaoping (zhangsubin)
 * @since 27/03/2018 5:23 PM
 */
public class ToStringTest {
    public static void main(String[] args) {
        ToStringModel model = new ToStringModel("Tom", 20, 185D, new java.util.Date(), true);
        System.out.println(model);
    }
}
