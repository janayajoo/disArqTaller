package TRABAJOS.designpatterns.problema3;

import TRABAJOS.designpatterns.problema3.ingredients.*;

// Builder
public interface Chef {

    void setSize(Size size);
    void setCrust(Crust crust);

    void addCheese(Cheese cheese);
    void addPepperoni(Pepperoni pepperoni);
    void addHam(Ham ham);
    void addMushrooms(Mushroom mushroom);
    void addPeppers(Pepper pepper);
    void addOnion(Onion onion);
    void addOlives(Olive olive);
    void addPineapple(Pineapple pineapple);
}
