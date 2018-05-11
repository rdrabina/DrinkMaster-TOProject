public class Barman {
    public Drink makeADrink(Recipe recipe) {
        return new Drink.DrinkBuilder(recipe)
                .ingredientList()
                .drinkVolume()
                .drinkPercentage()
                .build();
    }

}
