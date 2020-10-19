package deqo.gper.mysimplestack;

import java.util.EmptyStackException;

public class Gateau {

    private String name;
    private String ingredient;
    private int nbIngredient;
    
    public Gateau(String name, String ingredient, int nbIngredient){
        this.name = name;
        this.ingredient = ingredient;
        this.nbIngredient = nbIngredient;
    }

    @Override
    public String toString() {
        return "Gateau{" +
                "name='" + name + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", nbIngredient=" + nbIngredient +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int n() {
        return nbIngredient;
    }

    public void setNbIngredient(int nbIngredient) {
        this.nbIngredient = nbIngredient;
    }

}
