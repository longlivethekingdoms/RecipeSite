package com.findrecipe.found.Service;

import java.util.List;
import com.findrecipe.found.Model.Recipe;
import com.findrecipe.found.Model.User;

public interface LobbyService {
    List<Recipe> getHotRecipes();
    List<Recipe> getBestRecipes();
    List<User> getBestChefs();
}