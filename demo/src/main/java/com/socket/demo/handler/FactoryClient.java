package com.socket.demo.handler;

import com.socket.demo.c_enum.FactoryEnum;
import com.socket.demo.model.FactoryProduct;
import com.socket.demo.service.Factory;

public class FactoryClient {

    public static void main(String[] args) {
        // Factory pattern example.
        FactoryProduct factoryProduct = Factory.getProduct(FactoryEnum.PRODUCT_2);
        factoryProduct.getDetailProduct();
    }
}
