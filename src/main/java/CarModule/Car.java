package CarModule;

import CarEnum.TypeCar;
import CarEnum.TypeFuel;
import CarEnum.TypeGearBox;

import java.awt.*;

public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearBoxType;
    private double engineCapacity;

    public void movement() {}

    public void maintenance() {}

    public boolean gearShifting() {return true;}

    public boolean switchHeadLight() {return true;}

    public boolean switchWipers() {return true;}

    public String getMake() {return make;}

    public void setMake(String make) {this.make = make;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public Color getColor() {return color;}

    public void setColor(Color color) {this.color = color;}

    public TypeCar getBodyType() {return bodyType;}

    public void setBodyType(TypeCar bodyType) {this.bodyType = bodyType;}

    public int getNumberWheels() {return numberWheels;}

    public void setNumberWheels(int numberWheels) {this.numberWheels = numberWheels;}

    public TypeFuel getFuelType() {return fuelType;}

    public void setFuelType(TypeFuel fuelType) {this.fuelType = fuelType;}

    public TypeGearBox getGearBoxType() {return gearBoxType;}

    public void setGearBoxType(TypeGearBox gearBoxType) {this.gearBoxType = gearBoxType;}

    public double getEngineCapacity() {return engineCapacity;}

    public void setEngineCapacity(double engineCapacity) {this.engineCapacity = engineCapacity;}

}
