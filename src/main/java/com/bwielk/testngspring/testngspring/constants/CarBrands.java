package com.bwielk.testngspring.testngspring.constants;

public enum CarBrands {

    FIAT("Fiat"),
    VOLVO("Volvo"),
    FORD("Ford"),
    BMW("BMW");

    String carBrand;

    CarBrands(String carBrand){
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }
}
