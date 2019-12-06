package com.rkatarine.geoserver;

import org.junit.Test;

public class TestA {

    @Test
    public void getSize(){
        Layer layer1 = new MapLayer();
        Layer layer2 = new FeatureLayer();
        System.out.println(layer1.size());
        System.out.println(layer2.size());
    }
}
