package com.findrecipe.found.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.findrecipe.found.DAO.LobbyDAO;
import com.findrecipe.found.Model.Recipe;
import com.findrecipe.found.Model.User;

@Service
public class LobbyServiceImpl implements LobbyService {

    @Autowired
    private LobbyDAO lobbyDAO;

    @Override
    public List<Recipe> getHotRecipes() {
        return lobbyDAO.findHotRecipes();
    }

    @Override
    public List<Recipe> getBestRecipes() {
        return lobbyDAO.findBestRecipes();
    }

    @Override
    public List<User> getBestChefs() {
        return lobbyDAO.findBestChefs();
    }
}