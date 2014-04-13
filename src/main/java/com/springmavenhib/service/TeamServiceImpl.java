package com.springmavenhib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmavenhib.dao.TeamDao;
import com.springmavenhib.dao.TeamDaoImpl;
import com.springmavenhib.model.Team;

@Service
@Transactional
public class TeamServiceImpl implements ITeamService {

	@Autowired
	private TeamDao teamDao;
	
	public void addTeam(Team team) {
		teamDao.addTeam(team);
	}

	public void updateTeam(Team team) {
		teamDao.updateTeam(team);
	}

	public Team getTeam(int id) {
		return teamDao.getTeam(id);
	}

	public void deleteTeam(int id) {
		teamDao.deleteTeam(id);
	}

	public List<Team> getTeams() {
		return teamDao.getTeams();
	}

}
