package CarModule;

import InterfaceModule.iRefueling;
import InterfaceModule.iWipe;

public class PickUp extends Car implements iRefueling, iWipe {
private int loadCapacity;
@Override
public void fuel() {}
@Override
public void wipWindshield() {}

@Override
public void wipHeadlights() {}

@Override
public void wipMirrors() {}

public void setLoadCapacity(int loadCapacity) {this.loadCapacity = loadCapacity; }

}
