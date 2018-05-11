import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<Recipe> recipeList=new ArrayList<>();

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void showMenu()
    {
        System.out.println("########## MENU ##########");
        int i=1;
        for(Recipe r: recipeList){
            System.out.println("\t"+i+". "+r.getName());
            i++;
        }
        System.out.println("##########################");
    }

    public Recipe getRecipe(String name)
    {
        for (Recipe e: recipeList){
            if(e.getName().equals(name)) return e;
        }
        return null;
    }
}
