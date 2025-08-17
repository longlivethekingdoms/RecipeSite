package com.findrecipe.found.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.findrecipe.found.Service.LobbyService;

@Controller
public class LobbyController {

    @Autowired
    private LobbyService lobbyService;

    // ���� �κ�
    @GetMapping("/lobby")
    public String lobby(Model model) {
        model.addAttribute("hotRecipes", lobbyService.getHotRecipes());
        model.addAttribute("bestRecipes", lobbyService.getBestRecipes());
        model.addAttribute("bestChefs", lobbyService.getBestChefs());
        return "lobby/index";
    }

    // hot recipe ������
    @GetMapping("/hotrecipe")
    public String hotRecipe(Model model) {
        model.addAttribute("hotRecipes", lobbyService.getHotRecipes());
        return "lobby/hotrecipe";
    }

    // best recipe ������
    @GetMapping("/bestrecipe")
    public String bestRecipe(Model model) {
        model.addAttribute("bestRecipes", lobbyService.getBestRecipes());
        return "lobby/bestrecipe";
    }

    // best chef ������
    @GetMapping("/bestchef")
    public String bestChef(Model model) {
        model.addAttribute("bestChefs", lobbyService.getBestChefs());
        return "lobby/bestchef";
    }
}