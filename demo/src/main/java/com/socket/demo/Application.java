package com.socket.demo;

import com.socket.demo.model.BuilderExample;

public class Application {
    public static void main(String[] args) {

        BuilderExample clazz = BuilderExample.newBuilder().setItem1("item12").setItem2("item23").builder();
        System.out.println(clazz.toString());
    }
}
