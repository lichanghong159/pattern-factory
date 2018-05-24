package com.gupao.pattern.factory.abstr;

import com.gupao.pattern.factory.Beer;

/**
 * 抽象工厂
 * @createby: lichanghong on 2018-05-22 21:12
 **/
public abstract class AbstractFactory {
    //生产青岛啤酒
    public abstract Beer getQingDaoBeer();
    //生产雪花啤酒
    public abstract Beer getXueHuaBeer();
}
