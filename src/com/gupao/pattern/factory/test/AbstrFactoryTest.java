package com.gupao.pattern.factory.test;

import com.gupao.pattern.factory.Beer;
import com.gupao.pattern.factory.abstr.AbstractFactory;
import com.gupao.pattern.factory.abstr.BeerFactory;

/**
 * @createby: lichanghong on 2018-05-22 21:20
 **/
public class AbstrFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new BeerFactory();
        Beer qd = factory.getQingDaoBeer();
        System.out.println(qd.getBeer());
        Beer xh = factory.getQingDaoBeer();
        System.out.println(xh.getBeer());
    }
}
