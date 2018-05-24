package com.gupao.pattern.factory.func;

import com.gupao.pattern.factory.Beer;
import com.gupao.pattern.factory.QingDaoBeer;

/**
 * @createby: lichanghong on 2018-05-22 21:07
 **/
public class QingDaoFactory implements Factory {
    @Override
    public Beer getBeer() {
        return new QingDaoBeer();
    }
}
