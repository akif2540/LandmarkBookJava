package com.mehmetakifdadasoglu.landmarkbookjava;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String country;
    int image;

    //Constructor

    public Landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
