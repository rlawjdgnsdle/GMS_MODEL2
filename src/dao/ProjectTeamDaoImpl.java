package dao;

import java.util.List;

import domain.ProjectTeamBean;

public class ProjectTeamDaoImpl implements ProjectTeamDao {
	private static ProjectTeamDao instance = new ProjectTeamDaoImpl();
	public static ProjectTeamDao getInstance() {return instance;}
	private ProjectTeamDaoImpl() {} 
	@Override
	
	
	public void createProjectTeam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProjectTeam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProjectTeam() {
		// TODO Auto-generated method stub
		
	}

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

}
