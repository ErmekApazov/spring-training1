package com.cydeo.streotype_annotation.monitorfactory;

import com.cydeo.streotype_annotation.casefactory.Dimensions;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public abstract class Monitor {

    private String model;
    private String manufacturer;
    private int size;

    @Autowired
    private Dimensions dimensions;

    public Monitor(String model, String manufacturer, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public abstract void drawPixelAt();

}
