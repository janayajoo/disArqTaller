package TRABAJOS.designpatterns.problema3;

import TRABAJOS.designpatterns.problema3.ingredients.*;

import java.util.ArrayList;
import java.util.List;

// Concrete Builder
public class PizzaBuilder implements Chef{

    private Size size;
    private Crust crust;
    List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public void setSize(Size size) {
        this.size = size;
    }
    @Override
    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    @Override
    public void addCheese(Cheese cheese) {
        ingredients.add(cheese);
    }
    @Override
    public void addPepperoni(Pepperoni pepperoni) {
        ingredients.add(pepperoni);
    }
    @Override
    public void addHam(Ham ham) {
        ingredients.add(ham);
    }
    @Override
    public void addMushrooms(Mushroom mushroom) {
        ingredients.add(mushroom);
    }
    @Override
    public void addPeppers(Pepper pepper) {
        ingredients.add(pepper);
    }
    @Override
    public void addOnion(Onion onion) {
        ingredients.add(onion);
    }
    @Override
    public void addOlives(Olive olive) {
        ingredients.add(olive);
    }
    @Override
    public void addPineapple(Pineapple pineapple) {
        ingredients.add(pineapple);
    }

    public Pizza getPizza(){
        System.out.println("Pizza " + size.name() + " de masa " + crust.name() + " con los siguientes ingredientes:");
        for(Ingredient ingredient : ingredients){
            System.out.println(ingredient.getCuantity() + " adicion(es) de " + ingredient.getName());
        }

        return new Pizza(size, crust, ingredients);
    }
    public double getFinalCost(){
        double finalCost = 0;
        for (Ingredient ingredient : ingredients) {
            finalCost += ingredient.getTotalValue();
        }

        System.out.println("Costo final de " + finalCost + " pesos");

        return finalCost;
    }
}
