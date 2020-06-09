package com.socket.demo.service.impl;

import com.socket.demo.common.FactoryEnum;
import com.socket.demo.repository.inter.FactoryProduct;
import com.socket.demo.repository.impl.FactoryProduct1;
import com.socket.demo.repository.impl.FactoryProduct2;

public class Factory {

    private Factory() {}
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
