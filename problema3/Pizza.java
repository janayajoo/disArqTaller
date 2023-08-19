package TRABAJOS.designpatterns.problema3;

import TRABAJOS.designpatterns.problema3.ingredients.Ingredient;

import java.util.List;

public class Pizza {

    private final Size size;
    private final Crust crust;
    private final List<Ingredient> ingredients;

    public Pizza(Size size, Crust crust, List<Ingredient> ingredients) {
        this.size = size;
        this.crust = crust;
        this.ingredients = ingredients;
    }

    public Size getSize() {
        return size;
    }
    public Crust getCrust() {
        return crust;
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
