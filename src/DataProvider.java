import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public Menu provideData(){
        Menu menu = new Menu();

        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();

        Ingredient mint = new Ingredient(0,0,false);
        Ingredient whiteRum = new Ingredient(50,21,true);
        Ingredient water = new Ingredient(100,0,true);
        list1.add(mint);
        list1.add(whiteRum);
        list1.add(water);
        Recipe mojito = new Recipe("Mojito", list1);
        menu.getRecipeList().add(mojito);


        Ingredient tequila = new Ingredient(40, 15,true);
        Ingredient strawberry = new Ingredient(0,0,false);
        Ingredient cointreau = new Ingredient(20,40,true);
        Ingredient lemonJuice = new Ingredient(40,0,true);
        list2.add(tequila);
        list2.add(strawberry);
        list2.add(cointreau);
        list2.add(lemonJuice);
        Recipe margarita = new Recipe("Margarita",list2);
        menu.getRecipeList().add(margarita);

        Ingredient citron = new Ingredient(40, 7, true);
        Ingredient cointreau1 = new Ingredient(15, 40,true);
        Ingredient limeJuice = new Ingredient(15,0,true);
        Ingredient cranberryJuice = new Ingredient(30, 0, true);
        list3.add(citron);
        list3.add(cointreau1);
        list3.add(limeJuice);
        list3.add(cranberryJuice);
        Recipe cosmopolitan = new Recipe("Cosmopolitan", list3);
        menu.getRecipeList().add(cosmopolitan);


        return menu;
    }
}
