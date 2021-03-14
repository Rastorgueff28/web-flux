package com.rast.webflux.domain.temperature;

public class Temperature {

    private final double value;

    public Temperature( final double value ) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
