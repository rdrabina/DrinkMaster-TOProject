import java.util.List;

public class Recipe {
    private final String name;
    private List<Ingredient> ingredientList;

    public Recipe(String name, List<Ingredient> ingredientList) {
        this.name = name;
        this.ingredientList = ingredientList;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public int getDrinkVolume(String name){
        int volume=0;
        for(Ingredient e: ingredientList){
            if(e.isLiquid()) volume+=e.getVolume();
        }
        return volume;
    }

    public double getDrinkPercentage(String name){
        int alcohol=0;
        int volume=0;
        for (Ingredient e: ingredientList){
            if(e.isLiquid()){
                volume+=e.getVolume();
                alcohol+=e.getVolume()*e.getPercentage()/100;
            }

        }
        return 100*alcohol/volume;
    }


}
