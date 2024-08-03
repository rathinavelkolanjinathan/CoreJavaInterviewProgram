package org.javadesignpattern.creationaldesignpattern.factorydesign;

public class FactoryImpl_USA implements FactoryMethod_Currency {

    @Override
    public String getCurrency() {

        return "Dollar";
    }

    @Override
    public String getSymbol() {
        return "$";
    }

}
