package di.setter.example;

import java.util.ArrayList;
import java.util.List;

public class FastFood implements Food {
    private IngredientService ingredientService;

    public void setIngredientService(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @Override
    public List<String> getListPlates() {
        List<String> fastFoodList=new ArrayList<>();
        fastFoodList.add("Burger");
        fastFoodList.add("Tacos");
        fastFoodList.add("Kebab");
        return fastFoodList;
    }

    @Override
    public boolean isHealthyFood() {
        return false;
    }


    public List<String> getIngredientList(){

        return ingredientService.getIngredient();
    }


}
