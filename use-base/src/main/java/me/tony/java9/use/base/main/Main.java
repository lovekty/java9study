package me.tony.java9.use.base.main;

import me.tony.java9.study.base.BaseApi;
import me.tony.java9.study.base.smn.SMNBaseApi;

public class Main {
    public static void main(String[] args) {
        BaseApi baseApi = () -> "BaseApi";

        SMNBaseApi smnBaseApi = () -> "SMNBaseApi";
        System.out.println(baseApi.sayHello());
        System.out.println(smnBaseApi.sayHello());
    }
}
