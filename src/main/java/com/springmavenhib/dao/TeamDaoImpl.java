package com.springmavenhib.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmavenhib.model.Team;
@Repository
public class TeamDaoImpl implements TeamDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		
		return sessionFactory.getCurrentSession();
	}
	public void addTeam(Team team) {
		getCurrentSession().save(team);
	}

	public void updateTeam(Team team) {
		Team updateTeam=new Team();
		updateTeam.setId(team.getId());
		updateTeam.setName(team.getName());
		updateTeam.setRating(team.getRating());
		getCurrentSession().update(updateTeam);
		
		
	}

	public Team getTeam(int id) {
	Team team=(Team)getCurrentSession().get(Team.class, id);
	return team;
	}

	public void deleteTeam(int id) {
		Team team=getTeam(id); 
		if(team!=null)
	getCurrentSession().delete(team);
		

	}

	public List<Team> getTeams() {
	@SuppressWarnings("unchecked")
	List<Team> listTeam=getCurrentSession().createQuery("from Team").list();
	
	return listTeam;
	}

}
