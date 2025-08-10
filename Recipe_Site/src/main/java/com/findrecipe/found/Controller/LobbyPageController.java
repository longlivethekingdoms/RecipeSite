package com.findrecipe.found.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LobbyPageController {
	@RequestMapping(value="/Lobby", method=RequestMethod.GET)
	public String lobby(Model model) {
		model.addAttribute("greeting", "Welcome to RecipeSite");
		model.addAttribute("strapline", "Welcome to Web Recipe List");
		return "LobbyPage";
	}
}
