package CarModule;

import CarEnum.TypeFuel;
import InterfaceModule.iRefueling;

public class DieselCar extends Car implements iRefueling {
    @Override
    public void fuel() {
        System.out.println("заправка: " + TypeFuel.DIESEL);
    }

}