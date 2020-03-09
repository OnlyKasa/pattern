package com.socket.demo.model;

public class FactoryProduct2 implements FactoryProduct {
    @Override
    public String getName() {
        return FactoryProduct2.class.getName();
    }

    @Override
    public String getDetailProduct() {
        System.out.println("get detail product 2");
        return FactoryProduct2.class.getCanonicalName();
    }
}
