package TRABAJOS.designpatterns.problema3.ingredients;


public class Ingredient {

    public String name;
    public int cuantity;
    public double cpg; //por unidad

    Ingredient(int cuantity){
        this.cuantity = cuantity;
    }

    public String getName(){
        return name;
    }

    public int getCuantity(){
        return cuantity;
    }

    public double getTotalValue(){
        return (cuantity * cpg);
    }
}
