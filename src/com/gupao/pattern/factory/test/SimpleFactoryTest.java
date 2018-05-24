package com.gupao.pattern.factory.test;

import com.gupao.pattern.factory.Beer;
import com.gupao.pattern.factory.simple.SimpleFactory;

/**
 * @createby: lichanghong on 2018-05-22 20:56
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        //雪花啤酒
        Beer xhBeer =factory.getBeer("雪花");
        System.out.println(xhBeer.getBeer());
        //青岛啤酒
        Beer qdBeer =factory.getBeer("青岛");
        System.out.println(qdBeer.getBeer());
    }
}
