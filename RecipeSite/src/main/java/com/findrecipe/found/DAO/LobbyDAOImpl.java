package com.findrecipe.found.DAO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.findrecipe.found.Mapper.LobbyMapper;
import com.findrecipe.found.Model.Recipe;
import com.findrecipe.found.Model.User;

@Repository
public class LobbyDAOImpl implements LobbyDAO {

    @Autowired
    private LobbyMapper lobbyMapper;

    @Override
    public List<Recipe> findHotRecipes() {
        return lobbyMapper.selectHotRecipes();
    }

    @Override
    public List<Recipe> findBestRecipes() {
        return lobbyMapper.selectBestRecipes();
    }

    @Override
    public List<User> findBestChefs() {
        return lobbyMapper.selectBestChefs();
    }
}