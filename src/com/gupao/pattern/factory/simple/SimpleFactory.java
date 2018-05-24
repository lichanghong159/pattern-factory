package com.gupao.pattern.factory.simple;

import com.gupao.pattern.factory.Beer;
import com.gupao.pattern.factory.QingDaoBeer;
import com.gupao.pattern.factory.XueHuaBeer;

/**
 * 啤酒工厂
 *
 * @createby: lichanghong on 2018-05-22 20:52
 **/
public class SimpleFactory {
    public Beer getBeer(String name) {
        switch (name) {
            case "青岛":
                return new QingDaoBeer();
            case "雪花":
                return new XueHuaBeer();
            default:
                return null;
        }
    }
}
