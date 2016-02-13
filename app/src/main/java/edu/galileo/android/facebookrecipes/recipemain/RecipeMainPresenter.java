package edu.galileo.android.facebookrecipes.recipemain;

import edu.galileo.android.facebookrecipes.entities.Recipe;
import edu.galileo.android.facebookrecipes.recipemain.events.RecipeMainEvent;

/**
 * Created by ykro.
 */
public interface RecipeMainPresenter {
    void onCreate();
    void onDestroy();
    void dismissRecipe();
    void getNextRecipe();
    void saveRecipe(Recipe recipe);
    void onEventMainThread(RecipeMainEvent event);
}
