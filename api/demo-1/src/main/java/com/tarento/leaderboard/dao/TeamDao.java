package com.tarento.leaderboard.dao;

import com.tarento.leaderboard.models.Team;

public interface TeamDao {

	public Object getTeams();
	public Team addTeam(Team team); 

}
