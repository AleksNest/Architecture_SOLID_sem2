package CarModule;

import CarEnum.TypeFuel;
import InterfaceModule.iRefueling;

public class PetrolCar extends Car implements iRefueling {

    @Override
    public void fuel() {
        System.out.println("заправка: " + TypeFuel.GASOLINE);
    }
}
