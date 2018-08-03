package dao;

import java.util.List;

import domain.ProjectTeamBean;

public interface ProjectTeamDao {
	public void createProjectTeam();
	public void updateProjectTeam();
	public void deleteProjectTeam();
	public List<ProjectTeamBean> listTeam();
	public List<ProjectTeamBean> findTeam(String word);
	public ProjectTeamBean findTeamById(String id);	
	public int countTeam();
}
