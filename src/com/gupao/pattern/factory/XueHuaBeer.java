package com.gupao.pattern.factory;

import com.gupao.pattern.factory.Beer;

/**
 * @createby: lichanghong on 2018-05-22 20:51
 **/
public class XueHuaBeer implements Beer {
    @Override
    public String getBeer() {
        return "勇闯天涯，雪花啤酒!";
    }
}
