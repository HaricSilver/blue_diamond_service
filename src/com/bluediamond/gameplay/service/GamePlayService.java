package com.bluediamond.gameplay.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bluediamond.gameplay.BlueDiamondGame;
import com.google.gson.Gson;

@Path("/gameplay")
@Produces(MediaType.TEXT_PLAIN)
public class GamePlayService {

	@GET
	public String startGame() {
		BlueDiamondGame game = new BlueDiamondGame();
		return new Gson().toJson(game.getDiamondMatrix());
	}

}
