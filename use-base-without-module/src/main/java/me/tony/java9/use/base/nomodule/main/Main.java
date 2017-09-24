package me.tony.java9.use.base.nomodule.main;

import me.tony.java9.study.base.BaseApi;

public class Main {

    public static void main(String[] args) {

        BaseApi baseApi = () -> "BaseApi in nomodule call";

        System.out.println(baseApi.sayHello());

    }
}
