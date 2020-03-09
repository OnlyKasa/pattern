package com.socket.demo.service;

import com.socket.demo.c_enum.FactoryEnum;
import com.socket.demo.model.FactoryProduct;
import com.socket.demo.model.FactoryProduct1;
import com.socket.demo.model.FactoryProduct2;

public class Factory {
    public static FactoryProduct getProduct(FactoryEnum productName) {
        switch (productName) {
            case PRODUCT_1:
                return new FactoryProduct1();
            case PRODUCT_2:
                return new FactoryProduct2();
            default:
                throw new IllegalStateException("Unexpected value: " + productName);
        }
    }
}
