package com.findrecipe.found.Mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.findrecipe.found.Model.Recipe;
import com.findrecipe.found.Model.User;

@Mapper
public interface LobbyMapper {
    List<Recipe> selectHotRecipes();
    List<Recipe> selectBestRecipes();
    List<User> selectBestChefs();
}