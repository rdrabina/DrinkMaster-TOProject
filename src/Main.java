
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        Menu menu = dataProvider.provideData();
        Barman barman = new Barman();

        System.out.println("Choose a drink:\n");
        menu.showMenu();
        Scanner scanner = new Scanner(System.in);
        String drinkName = scanner.nextLine();
        Recipe recipe = menu.getRecipe(drinkName);
        if(recipe == null){
            System.out.println("Invalid name of drink.");
            return;
        }
        Drink drink = barman.makeADrink(recipe);
        System.out.println(drink.getName());
        System.out.println(drink.getDrinkVolume());
        System.out.println(drink.getDrinkPercentage());

    }
}
