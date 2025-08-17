package com.findrecipe.found.DAO;

import java.util.List;
import com.findrecipe.found.Model.Recipe;
import com.findrecipe.found.Model.User;

public interface LobbyDAO {
    List<Recipe> findHotRecipes();
    List<Recipe> findBestRecipes();
    List<User> findBestChefs();
}