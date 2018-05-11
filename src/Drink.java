import java.util.List;

public class Drink {
    private Recipe recipe;
    private List ingredientList;
    private int drinkVolume;
    private double drinkPercentage;

    private Drink() {
    }

    private Drink(DrinkBuilder drinkBuilder){
        if(drinkBuilder == null) return;
        recipe = drinkBuilder.recipe;
        ingredientList = drinkBuilder.ingredientList;
        drinkVolume = drinkBuilder.drinkVolume;
        drinkPercentage = drinkBuilder.drinkPercentage;
    }


    public String getName(){
        return recipe.getName();
    }

    public int getDrinkVolume() {
        return drinkVolume;
    }

    public double getDrinkPercentage() {
        return drinkPercentage;
    }



    public static class DrinkBuilder{
        private Recipe recipe;
        private List ingredientList;
        private int drinkVolume;
        private double drinkPercentage;

        public DrinkBuilder(Recipe recipe){
            this.recipe=recipe;
        }

        public DrinkBuilder ingredientList(){
            this.ingredientList=recipe.getIngredientList();
            return this;
        }

        public DrinkBuilder drinkVolume(){
            this.drinkVolume = recipe.getDrinkVolume(recipe.getName());
            return this;
        }

        public DrinkBuilder drinkPercentage(){
            this.drinkPercentage = recipe.getDrinkPercentage(recipe.getName());
            return this;
        }

        public Drink build(){
            return new Drink(this);
        }
    }
}
