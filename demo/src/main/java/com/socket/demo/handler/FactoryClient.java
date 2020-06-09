package com.socket.demo.handler;

import com.socket.demo.common.FactoryEnum;
import com.socket.demo.repository.inter.FactoryProduct;
import com.socket.demo.service.impl.Factory;

public class FactoryClient {

    public static void main(String[] args) {
        // Factory pattern example.
        FactoryProduct factoryProduct = Factory.getProduct(FactoryEnum.PRODUCT_2);
        factoryProduct.getDetailProduct();
    }
}
