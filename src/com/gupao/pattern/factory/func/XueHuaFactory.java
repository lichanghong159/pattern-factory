package com.gupao.pattern.factory.func;

import com.gupao.pattern.factory.Beer;
import com.gupao.pattern.factory.XueHuaBeer;

/**
 * @createby: lichanghong on 2018-05-22 21:07
 **/
public class XueHuaFactory implements Factory {
    @Override
    public Beer getBeer() {
        return new XueHuaBeer();
    }
}
