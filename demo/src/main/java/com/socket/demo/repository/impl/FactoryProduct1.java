package com.socket.demo.repository.impl;

import com.socket.demo.repository.inter.FactoryProduct;

public class FactoryProduct1 implements FactoryProduct {
    @Override
    public String getName() {
        return FactoryProduct1.class.getName();
    }

    @Override
    public String getDetailProduct() {
        System.out.println("get detail product 1");
        return FactoryProduct2.class.getCanonicalName();
    }
}
