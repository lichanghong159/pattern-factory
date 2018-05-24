package com.gupao.pattern.factory;

import com.gupao.pattern.factory.Beer;

/**
 * @createby: lichanghong on 2018-05-22 20:50
 **/
public class QingDaoBeer implements Beer {
    @Override
    public String getBeer() {
        return "青岛啤酒";
    }
}
