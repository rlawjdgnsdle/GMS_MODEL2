package service;

import java.util.List;

import domain.ProjectTeamBean;

public interface ProjectTeamService {
	public void createProjectTeam(ProjectTeamBean pro);
	public void updateProjectTeam(ProjectTeamBean pro);
	public void deleteProjectTeam(ProjectTeamBean pro);
	public List<ProjectTeamBean> listTeam();
	public List<ProjectTeamBean> findTeam(String word);
	public ProjectTeamBean findTeamById(String id);	
	public int countTeam();
}
////