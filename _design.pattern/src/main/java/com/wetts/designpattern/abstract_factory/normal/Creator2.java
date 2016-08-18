package com.wetts.designpattern.abstract_factory.normal;

import com.wetts.designpattern.abstract_factory.common.product.AbstractProductA;
import com.wetts.designpattern.abstract_factory.common.product.AbstractProductB;
import com.wetts.designpattern.abstract_factory.common.product.ProductA2;
import com.wetts.designpattern.abstract_factory.common.product.ProductB2;

public class Creator2 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }

}
