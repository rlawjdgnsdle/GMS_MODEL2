package service;

import java.util.List;

import domain.ProjectTeamBean;

public class ProjectTeamServiceImpl implements ProjectTeamService {
	private static ProjectTeamService instance = new ProjectTeamServiceImpl();
	public static ProjectTeamService getInstance() {return instance;}
	public ProjectTeamServiceImpl() {}


	@Override
	public List<ProjectTeamBean> listTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectTeamBean> findTeam(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectTeamBean findTeamById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countTeam() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void createProjectTeam(ProjectTeamBean pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProjectTeam(ProjectTeamBean pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProjectTeam(ProjectTeamBean pro) {
		// TODO Auto-generated method stub
		
	}

		
}
