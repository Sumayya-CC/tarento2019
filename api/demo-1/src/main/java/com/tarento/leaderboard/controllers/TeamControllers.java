package com.tarento.leaderboard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tarento.leaderboard.models.Team;
import com.tarento.leaderboard.service.TeamService;

@RestController
@RequestMapping(value= "/team")
public class TeamControllers {
	@Autowired
	TeamService teamService;
	
	@RequestMapping(value="/getTeams",method= RequestMethod.GET)
	public Object getTeams() {
		return teamService.getTeams();
	}
	@RequestMapping(value = "/addTeam", method = RequestMethod.POST)
    public Object addTeam(@RequestBody Team team) {
        return teamService.addTeam(team);
    }


}

