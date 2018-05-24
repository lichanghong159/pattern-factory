package com.gupao.pattern.factory.test;

import com.gupao.pattern.factory.Beer;
import com.gupao.pattern.factory.func.Factory;
import com.gupao.pattern.factory.func.QingDaoFactory;
import com.gupao.pattern.factory.func.XueHuaFactory;

/**
 * @createby: lichanghong on 2018-05-22 21:08
 **/
public class FactoryTest {
    public static void main(String[] args) {
        //青岛啤酒工厂
        Factory qdFactory = new QingDaoFactory();
        Beer qd = qdFactory.getBeer();
        System.out.println(qd.getBeer());
        //雪花啤酒工厂
        Factory xhFactory = new XueHuaFactory();
        Beer xh = xhFactory.getBeer();
        System.out.println(xh.getBeer());
    }
}
