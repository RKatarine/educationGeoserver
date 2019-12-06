package com.rkatarine.geoserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class LayerController {


    @GetMapping("/layers")
    public ArrayList getLayers(){
        ArrayList<String> layers = new ArrayList<>();
        return layers;
    }
}
