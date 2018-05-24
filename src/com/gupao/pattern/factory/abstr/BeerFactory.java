package com.gupao.pattern.factory.abstr;

import com.gupao.pattern.factory.Beer;
import com.gupao.pattern.factory.func.QingDaoFactory;
import com.gupao.pattern.factory.func.XueHuaFactory;

/**
 * 工厂
 * @createby: lichanghong on 2018-05-22 21:18
 **/
public class BeerFactory extends AbstractFactory {
    @Override
    public Beer getQingDaoBeer() {
        return new QingDaoFactory().getBeer();
    }

    @Override
    public Beer getXueHuaBeer() {
        return new XueHuaFactory().getBeer();
    }
}
