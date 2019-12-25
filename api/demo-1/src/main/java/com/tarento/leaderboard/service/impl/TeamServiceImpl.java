package com.tarento.leaderboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarento.leaderboard.dao.TeamDao;
import com.tarento.leaderboard.models.Team;
import com.tarento.leaderboard.service.TeamService;

@Service(value = "teamService")
public class TeamServiceImpl implements TeamService {
	@Autowired
	TeamDao teamDao;

	@Override
	public Object getTeams() {
		
		return teamDao.getTeams();
	}
	@Override
    public Object addTeam(Team team) {
        return teamDao.addTeam(team);
    }


	
}
